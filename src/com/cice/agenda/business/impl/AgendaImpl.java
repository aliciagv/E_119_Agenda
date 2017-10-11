/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.agenda.business.impl;

import java.util.ArrayList;
import com.cice.agenda.business.IAgenda;
import com.cice.agenda.dto.ContactoPersonalDTO;
import java.util.Comparator;

/**
 *
 * @author cice
 */
public class AgendaImpl implements IAgenda {

    private ArrayList<ContactoPersonalDTO> lcontacto = new ArrayList<>();

    public ArrayList<ContactoPersonalDTO> getLcontacto() {
        return lcontacto;
    }

    public void setLcontacto(ArrayList<ContactoPersonalDTO> lcontacto) {
        this.lcontacto = lcontacto;
    }

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
        if (lcontacto.size() == 0) {
            System.out.println("No hay contactos en la agenda que mostrar");
        } else {
            Comparator<ContactoPersonalDTO> comparator = (a, b) -> a.getNombre().compareTo(b.getNombre());
            lcontacto.sort((a, b) -> a.getNombre().compareTo(b.getNombre()));
            for (ContactoPersonalDTO p : lcontacto) {
                p.mostrarInfo();
            }
        }
    }

    @Override
    public void buscarContactosByNombreApellido(String contacto) {
        
        boolean exixte=lcontacto.stream().allMatch(a->a.getNombre().contains(contacto) || a.getPrimerApellido().contains(contacto));
                
        for (ContactoPersonalDTO p : lcontacto) {
            if (p.getNombre().contains(contacto) || p.getPrimerApellido().contains(contacto) || p.getSegundoApellido().contains(contacto)) {
                p.mostrarInfo();
            }
            

        }
    }

    @Override
    public boolean contactoExistente(ContactoPersonalDTO c) {
        for (ContactoPersonalDTO p : lcontacto) {
            if (p.compareTo(c) == 0) {
                return true;
            }
        }
        return false;

    }

    public ArrayList<ContactoPersonalDTO> buscarContactosByNombre(String contacto) {
        ArrayList<ContactoPersonalDTO> lcontactobynombre = new ArrayList<>();
        for (ContactoPersonalDTO p : lcontacto) {
            if (p.getNombre().equalsIgnoreCase(contacto)) {
                lcontactobynombre.add(p);
            }
        }
        return lcontactobynombre;
    }

    public void mostrarCoincidencias(ArrayList<ContactoPersonalDTO> lcontactobynombre) {
        int i = 1;
        for (ContactoPersonalDTO p : lcontactobynombre) {
            System.out.print(i + ". ");
            p.mostrarNombreCompleto();
            i++;
        }
    }

    public void mostrarListadoAgenda() {
        int i = 1;
        for (ContactoPersonalDTO p : lcontacto) {
            System.out.print(i + ". ");
            p.mostrarNombreCompleto();
            i++;
        }

    }

    @Override
    public boolean isEmpty() {
        return lcontacto != null && lcontacto.size() == 0;
    }

}
