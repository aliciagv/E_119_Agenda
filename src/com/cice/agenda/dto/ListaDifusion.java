/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.agenda.dto;


import com.cice.agenda.dto.enumeration.TipoLista;
import com.cice.agenda.dto.pojo.PersonaPOJO;
import java.util.ArrayList;

/**
 *
 * @author cice
 */
public class ListaDifusion {
    
    private ArrayList<PersonaPOJO> listaDifusion;
    private String nombreLista;
    private TipoLista tipoLista;

    public ListaDifusion() {
    }

    public ListaDifusion(ArrayList<PersonaPOJO> listaDifusion) {
        this.listaDifusion = listaDifusion;
    }
    

    public ArrayList<PersonaPOJO> getListaDifusion() {
        return listaDifusion;
    }

    public void setListaDifusion(ArrayList<PersonaPOJO> listaDifusion) {
        this.listaDifusion = listaDifusion;
    }

    public String getNombreLista() {
        return nombreLista;
    }

    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }
    
    
    public TipoLista getTipoLista() {
        return tipoLista;
    }

    public void setTipoLista(TipoLista tipoLista) {
        this.tipoLista = tipoLista;
    }
    
    
}
