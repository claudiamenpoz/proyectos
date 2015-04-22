/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Instituciones;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author FAMILIA ALDANA
 */
@Local
public interface InstitucionesFacadeLocal {

    void create(Instituciones instituciones);

    void edit(Instituciones instituciones);

    void remove(Instituciones instituciones);

    Instituciones find(Object id);

    List<Instituciones> findAll();

    List<Instituciones> findRange(int[] range);

    int count();
    
}
