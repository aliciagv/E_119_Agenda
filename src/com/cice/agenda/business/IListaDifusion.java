/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.agenda.business;

import com.cice.agenda.dto.ContactoPersonalDTO;

/**
 *
 * @author Alicia
 */
public interface IListaDifusion {
    
    public void crearListaDifusion(String nombreLista);
    public void addContacto(String nombreLista,ContactoPersonalDTO c);
    public boolean existeListaDifusion(String nombre);
    public void mostarInfo();
    
}
