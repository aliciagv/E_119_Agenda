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
       if (lcontacto.size()==0) {
           System.out.println("No hay contactos en la agenda que mostrar");
       } 
       for (ContactoPersonalDTO p:lcontacto){
            p.mostrarInfo();
       }
    }

    @Override
    public void buscarContactosByNombreApellido(String contacto) {
       for (ContactoPersonalDTO p: lcontacto) {
           if (p.getNombre().contains(contacto)|| p.getPrimerApellido().contains(contacto) || p.getSegundoApellido().contains(contacto)){
               p.mostrarInfo();
           }
       
       }
    }
    
}
