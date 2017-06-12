/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import conexion.SessionManager;
import datos.dOperadores;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author mike
 */
public class operadoresManager {
    
    
       public List<dOperadores> listadoOPbyCampo(String data){
      Session s = SessionManager.getSession();
         try {
           return  s.createCriteria(dOperadores.class).
             add(Restrictions.like("nombre", "%"+data+"%"))
                
            .list();
         } finally{
          s.close();
             
         }
      
      
      
      }
    
}
