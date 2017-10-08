/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.agenda.dto;


import com.cice.agenda.dto.enumeration.TipoLista;
import com.cice.agenda.dto.pojo.DireccionPOJO;
import com.cice.agenda.dto.pojo.PersonaPOJO;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author cice
 */
public class ListaDifusionDTO {
    
    private HashMap<String,ArrayList<ContactoPersonalDTO>> hmlistaDifusion;
    private TipoLista tipoLista;
    
     


    public ListaDifusionDTO() {
    }

    public HashMap<String, ArrayList<ContactoPersonalDTO>> getListaDifusion() {
        return hmlistaDifusion;
    }

    public void setListaDifusion(HashMap<String, ArrayList<ContactoPersonalDTO>> listaDifusion) {
        this.hmlistaDifusion = listaDifusion;
    }
    
    public  ArrayList<ContactoPersonalDTO> getListaDifusion(String listaNombre) {
        return hmlistaDifusion.get(listaNombre);
    }
    
    public TipoLista getTipoLista() {
        return tipoLista;
    }

    public void setTipoLista(TipoLista tipoLista) {
        this.tipoLista = tipoLista;
    }
    
    
}
