/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Proyectos;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author FAMILIA ALDANA
 */
@Stateless
public class ProyectosFacade extends AbstractFacade<Proyectos> implements ProyectosFacadeLocal {
    @PersistenceContext(unitName = "proyectos2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProyectosFacade() {
        super(Proyectos.class);
    }

    @Override
    public List getList() {
        return em.createNamedQuery("Proyectos.findAll").getResultList();
    }

    @Override
    public List busqueda(String desc) {
        String jpql = "SELECT c FROM Proyectos c where 1=1";
		
		if(desc != null  ){
			jpql += " AND UPPER(c.proyectoDesc) like :desc";
		}
		
		Query query = em.createQuery(jpql);
		
		if(desc != null  ){
			query.setParameter("Descripción", "%"+desc.toUpperCase()+"%");
		}
		
		return query.getResultList();
    }

    @Override
    public Proyectos getProyecto(Integer proyecto) {
        
        return (Proyectos) em.createNamedQuery("Proyectos.findByProyectoId").setParameter("proyectoId",proyecto).getSingleResult();
	
    }
    
}
