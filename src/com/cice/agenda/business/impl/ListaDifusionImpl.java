/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.agenda.business.impl;

import com.cice.agenda.business.IListaDifusion;
import com.cice.agenda.dto.ContactoPersonalDTO;
import com.cice.agenda.dto.ListaDifusionDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Alicia
 */
public class ListaDifusionImpl implements IListaDifusion{
    
    private List<ListaDifusionDTO> listaDifusion = new ArrayList<>();

   

    @Override
    public void crearListaDifusion(String nombreLista) {
       
        HashMap<String,ArrayList<ContactoPersonalDTO>> hmlistaDifusion = new HashMap<String,ArrayList<ContactoPersonalDTO>>();
        hmlistaDifusion.put(nombreLista, new ArrayList<ContactoPersonalDTO>());
        
    }
    
     @Override
    public void addContacto(String nombreLista,ContactoPersonalDTO c) {
           }
    
    public boolean existeListaDifusion(String nombre){
        for (ListaDifusionDTO ldDTO: listaDifusion){
            if (ldDTO.getListaDifusion().containsKey(nombre)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void mostarInfo() {
         Iterator<Map.Entry<String, ArrayList<ContactoPersonalDTO>>> iterator;
         Map.Entry<String, ArrayList<ContactoPersonalDTO>> entry;
         for (ListaDifusionDTO ldDTO: listaDifusion){
             iterator= ldDTO.getListaDifusion().entrySet().iterator();
             while (iterator.hasNext()){
                 entry=iterator.next();
                 System.out.println("Lista "+ entry.getKey()+ ": ");
                 ArrayList<ContactoPersonalDTO> lcontactos =(ArrayList<ContactoPersonalDTO>)entry.getValue();
                 for (ContactoPersonalDTO contacto: lcontactos){
                     contacto.mostrarNombreCompleto();
                 }
             }
             
           
        }
    }
    
    
}
