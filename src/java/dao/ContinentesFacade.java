/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Continentes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author FAMILIA ALDANA
 */
@Stateless
public class ContinentesFacade extends AbstractFacade<Continentes> implements ContinentesFacadeLocal {
    @PersistenceContext(unitName = "proyectos2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ContinentesFacade() {
        super(Continentes.class);
    }
    
}
