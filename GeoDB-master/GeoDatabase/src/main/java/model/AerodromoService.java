
package model;
import util.JPAUtil;
import javax.persistence.EntityManager;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.io.ParseException;
import org.locationtech.jts.io.WKTReader;

public class AerodromoService {
    public List<Aerodromo> aerodromosDaPB(String sigla_uf){
        List<Aerodromo> result = null;
        EntityManager em = JPAUtil.createEntityManager();   
        em.getTransaction().begin();
        
        Query query = em.createQuery("select a from Aerodromo a, Estado e where within(a.geometria, e.geometria)= true and e.sigla_uf = :sigla_uf");
        query.setParameter("sigla_uf", sigla_uf);
        result = query.getResultList();
        em.getTransaction().commit();
        em.close();
        
        return result;
    }
    
}
