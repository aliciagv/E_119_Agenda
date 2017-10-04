/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.agenda.business;

import com.cice.agenda.dto.ContactoPersonalDTO;






/**
 *
 * @author cice
 */
public interface IAgenda {
    
    public void agregar(ContactoPersonalDTO c);
    public void editar(ContactoPersonalDTO c);
    public void eliminar(ContactoPersonalDTO c);
    public void mostrar();
    public void buscarContactosByNombreApellido(String contacto);
    
    
}
