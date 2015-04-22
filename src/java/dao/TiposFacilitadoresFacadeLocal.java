/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.TiposFacilitadores;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author FAMILIA ALDANA
 */
@Local
public interface TiposFacilitadoresFacadeLocal {

    void create(TiposFacilitadores tiposFacilitadores);

    void edit(TiposFacilitadores tiposFacilitadores);

    void remove(TiposFacilitadores tiposFacilitadores);

    TiposFacilitadores find(Object id);

    List<TiposFacilitadores> findAll();

    List<TiposFacilitadores> findRange(int[] range);

    int count();
    
}
