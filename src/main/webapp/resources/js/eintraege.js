function ladeEintraege() {
	$.ajax({
				type : "GET",
				url : "eintrag",
				contentType : "application/json; charset=utf-8",
				dataType : "json",
				success : function(data, status, jqXHR) {
					$('#eintraege').empty();

					for ( var i in data) {
						eintragAnzeigen(data[i].verfasser, data[i].text,
								data[i].datum);
					}
				},
				error : function(jqXHR, status) {
					alert(status);
				}
			});
}

function eintragAnzeigen(verfasser, text, datum) {
	var eintragText = document.createTextNode(text);
	var verfasserText = document.createTextNode(verfasser + ' am '
			+ $.format.toBrowserTimeZone(datum, "dd.MM.yyyy") + ' um '
			+ $.format.toBrowserTimeZone(datum, "HH:mm:ss"));

	var textElement = document.createElement("eintrag");
	var verfasserElement = document.createElement("verfasser");

	textElement.appendChild(eintragText);
	verfasserElement.appendChild(verfasserText);

	var li = document.createElement("li");

	li.appendChild(textElement);
	li.appendChild(verfasserElement);

	$('#eintraege').prepend(li);
}

function neuenEintragErstellen() {
	var verfasserVN = $('#verfasser_inputvorname').val();
	var verfasserNN = $('#verfasser_inputnachname').val();
	var kindNN = $('#verfasser_inputvornameKind').val();
	var kindVN = $('#verfasser_inputnachnameKind').val();
	var prio1 = $('#verfasser_inputPrio1').val();
	var prio2 = $('#verfasser_inputPrio2').val();
	var prio3 = $('#verfasser_inputPrio3').val();
	var text = $('#text_input').val();

	var jsonData = {
		"verfasserVN" : verfasserVN,
		"verfasserNN" : verfasserVN,
		"kindNN" : kindNN,
		"kindVN" : kindVN,
		"prio1" : prio1,
		"prio2" : prio2,
		"prio3" : prio3,
		"text" : text
	};

	$.ajax({
		type : "POST",
		url : "eintrag",
		data : JSON.stringify(jsonData),
		contentType : "application/json; charset=utf-8",
		success : function(data, status, jqXHR) {
			$('#verfasser_inputvorname').val('');
			$('#verfasser_inputnachname').val('');
			$('#verfasser_inputvornameKind').val('');
			$('#verfasser_inputnachnameKind').val('');
			$('#verfasser_inputPrio1').val('');
			$('#verfasser_inputPrio2').val('');
			$('#verfasser_inputPrio3').val('');
			$('#text_input').val('');
			ladeEintraege();
		},
		error : function(response, status, error) {
			var error = JSON.parse(response.responseText);
			alert(error.message);
		}
	});
}

function ladeKitas() {
	$.ajax({
		type : "GET",
		url : "http://prodigy84.pythonanywhere.com/api/kitas",
		contentType : "application/json; charset=utf-8",
		dataType : "json",
		success : function(data, status, jqXHR) {
            var list_html = "<ol>";
            for( var i=0; i <data.length; i++) {
               list_html += "<li>" + data[i].STADTBEZIRK + "</li>";
             }
            list_html += "</ol>"
            $("#kitas").html(list_html);
		},
		error : function(jqXHR, textStatus, errorThrown) {
			//alert(textStatus + ": " + errorThrown);
		}
	});
}
