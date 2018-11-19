package de.reineckm.test.isyfact.service.rest;

import de.reineckm.test.isyfact.core.verwaltung.Verwaltung;
import de.reineckm.test.isyfact.core.verwaltung.ausgabedaten.EintragDaten;
import de.reineckm.test.isyfact.core.verwaltung.eingabedaten.NeuerEintrag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * REST-Controller für Einträge.
 */
@RestController
@RequestMapping("/antrag")
public class AntragController {

    private final Verwaltung verwaltung;

    @Autowired
    public AntragController(Verwaltung verwaltung) {
        this.verwaltung = verwaltung;
    }

    /**
     * Erzeugt einen neuen Eintrag.
     *
     * @param neuerEintrag Schnittstellenobjekt zur Erstellung eines neuen Eintrags.
     */
//    @RequestMapping(method=RequestMethod.POST)
//    @ResponseStatus(HttpStatu.CREATED)
//    public void erstelleAntrag(@RequestBody NeuerEintrag neuerEintrag) {
//        if (neuerEintrag.getVerfasser().isEmpty() || neuerEintrag.getText().isEmpty()) {
//            throw new IllegalArgumentException("Text und/oder Verfasser leer");
//        }
//
//        verwaltung.neuerEintrag(neuerEintrag);
//    }

    /**
     * Liest alle vorhandenen Einträge.
     *
     * @return Eine Liste mit allen vorhandenen Einträgen.
     */
//    @RequestMapping(method = RequestMethod.GET)
//    @ResponseStatus(HttpStatus.OK)
//    public @ResponseBody List<EintragDaten> leseEintraege() {
//        return verwaltung.leseAlleEintraege();
//    }
//
//
//    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
//    @ExceptionHandler(IllegalArgumentException.class)
//    public @ResponseBody ExceptionJsonInfo leererEintrag(HttpServletRequest request, Exception ex) {
//
//        return new ExceptionJsonInfo(ex.getMessage());
//    }
}
