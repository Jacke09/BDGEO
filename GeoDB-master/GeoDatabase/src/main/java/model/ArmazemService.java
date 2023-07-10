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

public class ArmazemService {
     public String poligonoArmazem(String municipio){
        String result = null;
        EntityManager em = JPAUtil.createEntityManager();   
        em.getTransaction().begin();       
        Query query = em.createQuery("select astext(envelope(a.geometria)) from Armazem a where a.municipio = :municipio");
        query.setParameter("municipio", municipio);
        result = (String) query.getSingleResult();
        em.getTransaction().commit();
        em.close();
        return result;
    } 
     
}
