package temp.temp.persistence.verwaltung.dao;

import temp.temp.persistence.verwaltung.entity.Eintrag;
import de.bund.bva.pliscommon.persistence.dao.Dao;

import java.util.List;

/**
 * DAO-Interface für die Persistierung von Einträgen.
 */
public interface EintragDao extends Dao<Eintrag, Long> {

    /**
     * Liest alle vorhandenen Einträge.
     *
     * @return Eine Liste mit allen Einträgen.
     */
    List<Eintrag> leseAlle();
}
