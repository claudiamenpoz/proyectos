/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Continentes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author FAMILIA ALDANA
 */
@Local
public interface ContinentesFacadeLocal {

    void create(Continentes continentes);

    void edit(Continentes continentes);

    void remove(Continentes continentes);

    Continentes find(Object id);

    List<Continentes> findAll();

    List<Continentes> findRange(int[] range);

    int count();
    
}
