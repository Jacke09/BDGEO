/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import util.JPAUtil;
import javax.persistence.EntityManager;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.io.ParseException;
import org.locationtech.jts.io.WKTReader;

public class FerroviaService {
    
    public List<Ferrovia> listarFerroviasVizinhas(String ferrovia){
        List<Ferrovia> result = null;
        EntityManager em = JPAUtil.createEntityManager();   
        em.getTransaction().begin();       

        Query query = em.createQuery("select fb from Ferrovia fa, Ferrovia fb where touches(fa.geometria, fb.geometria) = true and fa.ferrovia = :ferrovia");//, Alert.class);
        query.setParameter("ferrovia", ferrovia);
        result = query.getResultList();
        em.getTransaction().commit();
        em.close();
        
        return result;
    }
    
}
