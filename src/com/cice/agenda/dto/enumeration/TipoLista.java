/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.agenda.dto.enumeration;

/**
 *
 * @author cice
 */
public enum TipoLista {
    
    ABIERTA("Abierta"),
    EXCLUSIVA("Exclusiva"),
    CERRADA("Cerrada"),
    MODERADA("Moderada");
            
    private String tipo;

    private TipoLista(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    
    
    
}
