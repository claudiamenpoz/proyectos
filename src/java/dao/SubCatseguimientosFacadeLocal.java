/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.SubCatseguimientos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author FAMILIA ALDANA
 */
@Local
public interface SubCatseguimientosFacadeLocal {

    void create(SubCatseguimientos subCatseguimientos);

    void edit(SubCatseguimientos subCatseguimientos);

    void remove(SubCatseguimientos subCatseguimientos);

    SubCatseguimientos find(Object id);

    List<SubCatseguimientos> findAll();

    List<SubCatseguimientos> findRange(int[] range);

    int count();
    
}
