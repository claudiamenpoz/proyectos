/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.AsignaFacilitadores;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author FAMILIA ALDANA
 */
@Local
public interface AsignaFacilitadoresFacadeLocal {

    void create(AsignaFacilitadores asignaFacilitadores);

    void edit(AsignaFacilitadores asignaFacilitadores);

    void remove(AsignaFacilitadores asignaFacilitadores);

    AsignaFacilitadores find(Object id);

    List<AsignaFacilitadores> findAll();

    List<AsignaFacilitadores> findRange(int[] range);

    int count();
    
}
