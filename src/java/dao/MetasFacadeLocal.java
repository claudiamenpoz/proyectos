/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Metas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author FAMILIA ALDANA
 */
@Local
public interface MetasFacadeLocal {

    void create(Metas metas);

    void edit(Metas metas);

    void remove(Metas metas);

    Metas find(Object id);

    List<Metas> findAll();

    List<Metas> findRange(int[] range);

    int count();
    
}
