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

public class PortoService {
     public List<Porto> portosIntersect(String nome_regia){
        List<Porto> result = null;
        EntityManager em = JPAUtil.createEntityManager();   
        em.getTransaction().begin();    
        
        Query query = em.createQuery("select p from Porto p, Estado e where intersects(p.geometria, e.geometria)= true and p.nome_regia = :nome_regia");
        query.setParameter("nome_regia", nome_regia);
        result = query.getResultList();
        em.getTransaction().commit();
        em.close();
        
        return result;
    }
     
     // Saber a soma total de um porto
     public double somaTotal(String municipio){
        double result = 0;
        EntityManager em = JPAUtil.createEntityManager();   
        em.getTransaction().begin();       

        Query query = em.createQuery("select s sum_total s, from Porto p where p.municipio = :municipio");
        query.setParameter("municipio", municipio);
        result = (double)query.getSingleResult();
        em.getTransaction().commit();
        em.close();
        return result;
    }
     
     
     public List<Porto> listarPortos(String municipio){
        List<Porto> result = null;
        EntityManager em = JPAUtil.createEntityManager();   
        em.getTransaction().begin();       

        Query query = em.createQuery("select st from Porto st where st.municipio = :municipio");
        query.setParameter("municipio", municipio);
        result = query.getResultList();
        em.getTransaction().commit();
        em.close();
        
        return result;
    } 
     
     
          
     
}
     

          
     
     
     
     

     
          

     
          
     
     
     
     

     
          
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     

     
        
          
      

     
     

     
    
