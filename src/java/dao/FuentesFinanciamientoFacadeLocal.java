/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.FuentesFinanciamiento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author FAMILIA ALDANA
 */
@Local
public interface FuentesFinanciamientoFacadeLocal {

    void create(FuentesFinanciamiento fuentesFinanciamiento);

    void edit(FuentesFinanciamiento fuentesFinanciamiento);

    void remove(FuentesFinanciamiento fuentesFinanciamiento);

    FuentesFinanciamiento find(Object id);

    List<FuentesFinanciamiento> findAll();

    List<FuentesFinanciamiento> findRange(int[] range);

    int count();
    
}
