/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.agenda.business;

import com.cice.agenda.dto.ContactoPersonalDTO;
import java.util.ArrayList;






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
    public boolean contactoExistente(ContactoPersonalDTO c);
    public ArrayList<ContactoPersonalDTO> buscarContactosByNombre(String contacto);
    public void mostrarCoincidencias(ArrayList<ContactoPersonalDTO> lcontactobynombre);
    public void mostrarListadoAgenda();
    public boolean isEmpty();
    
    
}
