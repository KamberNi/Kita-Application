package temp.temp.persistence.verwaltung.dao.jpa;

import temp.temp.persistence.verwaltung.dao.EintragDao;
import temp.temp.persistence.verwaltung.entity.Eintrag;
import de.bund.bva.pliscommon.persistence.dao.AbstractDao;

import javax.persistence.TypedQuery;
import java.util.List;

public class JpaEintragDao extends AbstractDao<Eintrag, Long> implements EintragDao {

    @Override
    public List<Eintrag> leseAlle() {
        TypedQuery<Eintrag> query = getEntityManager().createQuery("select e from Eintrag e order by e.datum", Eintrag.class);

        return query.getResultList();
    }
}
