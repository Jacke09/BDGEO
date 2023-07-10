package model;
import util.JPAUtil;
import javax.persistence.EntityManager;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.io.ParseException;
import org.locationtech.jts.io.WKTReader;

public class AeroportoService {
    
    public double distanciaEntreAeroporto(String aeroportoA, String aeroportoB){
        double result = 0;
        EntityManager em = JPAUtil.createEntityManager();   
        em.getTransaction().begin();       

        Query query = em.createQuery("select distance(geography(aa.geometria), geography(ab.geometria)) from Aeroporto aa, Aeroporto ab where aa.municipio = :aeroportoA  and   ab.municipio = :aeroportoB");
        query.setParameter("aeroportoA", aeroportoA);
        query.setParameter("aeroportoB", aeroportoB);

        result = (double)query.getSingleResult();
        
        em.getTransaction().commit();
        em.close();
        
        return result;
    }
  
    
}
