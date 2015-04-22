/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Movimientos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author FAMILIA ALDANA
 */
@Local
public interface MovimientosFacadeLocal {

    void create(Movimientos movimientos);

    void edit(Movimientos movimientos);

    void remove(Movimientos movimientos);

    Movimientos find(Object id);

    List<Movimientos> findAll();

    List<Movimientos> findRange(int[] range);

    int count();
    
}
