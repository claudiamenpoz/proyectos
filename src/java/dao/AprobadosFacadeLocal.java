/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Aprobados;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author FAMILIA ALDANA
 */
@Local
public interface AprobadosFacadeLocal {

    void create(Aprobados aprobados);

    void edit(Aprobados aprobados);

    void remove(Aprobados aprobados);

    Aprobados find(Object id);

    List<Aprobados> findAll();

    List<Aprobados> findRange(int[] range);

    int count();
    
}
