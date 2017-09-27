/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.agenda.business.impl;

import java.util.ArrayList;
import com.cice.agenda.business.IAgenda;
import com.cice.agenda.dto.ContactoPersonalDTO;

/**
 *
 * @author cice
 */
public class AgendaImpl implements IAgenda{

    ArrayList<ContactoPersonalDTO> lcontacto = new ArrayList<ContactoPersonalDTO>();
    
    
    public void agregar(ContactoPersonalDTO c) {
        lcontacto.add(c);
    }

    @Override
    public void editar(ContactoPersonalDTO c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(ContactoPersonalDTO c) {
        lcontacto.remove(c);
    }

    @Override
    public void mostrar() {
       for (ContactoPersonalDTO p:lcontacto){
            p.mostrarInfo();
       }
    }

    @Override
    public void buscarContactosByNombreApellido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
