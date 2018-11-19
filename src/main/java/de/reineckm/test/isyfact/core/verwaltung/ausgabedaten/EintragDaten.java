package de.reineckm.test.isyfact.core.verwaltung.ausgabedaten;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.ZonedDateTime;
import java.time.ZonedDateTime;

/**
 * Schnittstellenobjekt zum Darstellen eines Eintrags.
 */
public class EintragDaten {
	private String verfasser;
	private String text;
	private String mutterNN;
	private String mutterVN;
	private String kindVN;
	private String kindNN;

	private int prio1;
	private int prio2;
	private int prio3;
	private ZonedDateTime datum;

	public String getMutterNN() {
		return mutterNN;
	}

	public void setMutterNN(String mutterNN) {
		this.mutterNN = mutterNN;
	}

	public String getMutterVN() {
		return mutterVN;
	}

	public void setMutterVN(String mutterVN) {
		this.mutterVN = mutterVN;
	}

	public String getKindVN() {
		return kindVN;
	}

	public void setKindVN(String kindVN) {
		this.kindVN = kindVN;
	}

	public String getKindNN() {
		return kindNN;
	}

	public void setKindNN(String kindNN) {
		this.kindNN = kindNN;
	}

	public int getPrio1() {
		return prio1;
	}

	public void setPrio1(int prio1) {
		this.prio1 = prio1;
	}

	public int getPrio2() {
		return prio2;
	}

	public void setPrio2(int prio2) {
		this.prio2 = prio2;
	}

	public int getPrio3() {
		return prio3;
	}

	public void setPrio3(int prio3) {
		this.prio3 = prio3;
	}

	/**
	 * Erzeugt ein neues Schnittstellenobjekt zum Darstellen eines Eintrags.
	 *
	 * @param verfasser Der Verfasser des Eintrags
	 * @param text      Der Text des Eintrags
	 * @param datum     Datum und Uhrzeit des Eintrags.
	 */
	public EintragDaten(String verfasser, String text, ZonedDateTime datum) {
		this.verfasser = verfasser;
		this.text = text;
		this.datum = datum;
	}

	public String getVerfasser() {
		return verfasser;
	}

	public void setVerfasser(String verfasser) {
		this.verfasser = verfasser;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public ZonedDateTime getDatum() {
		return datum;
	}

	public void setDatum(ZonedDateTime datum) {
		this.datum = datum;
	}
}
