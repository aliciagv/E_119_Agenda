/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.agenda.business.impl;

import com.cice.agenda.dto.pojo.PersonaPOJO;
import java.util.ArrayList;
import com.cice.agenda.business.IAgenda;

/**
 *
 * @author cice
 */
public class AgendaImpl implements IAgenda{

    ArrayList<PersonaPOJO> lcontacto = new ArrayList<PersonaPOJO>();
    
    
    public void agregar(PersonaPOJO c) {
        lcontacto.add(c);
    }

    @Override
    public void editar(PersonaPOJO c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(PersonaPOJO c) {
        lcontacto.remove(c);
    }

    @Override
    public void mostrar() {
       for (PersonaPOJO p:lcontacto){
            p.mostrarInfo();
       }
    }

    @Override
    public void buscarContactosByNombreApellido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
