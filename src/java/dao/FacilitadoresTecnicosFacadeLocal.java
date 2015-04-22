/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.FacilitadoresTecnicos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author FAMILIA ALDANA
 */
@Local
public interface FacilitadoresTecnicosFacadeLocal {

    void create(FacilitadoresTecnicos facilitadoresTecnicos);

    void edit(FacilitadoresTecnicos facilitadoresTecnicos);

    void remove(FacilitadoresTecnicos facilitadoresTecnicos);

    FacilitadoresTecnicos find(Object id);

    List<FacilitadoresTecnicos> findAll();

    List<FacilitadoresTecnicos> findRange(int[] range);

    int count();
    
}
