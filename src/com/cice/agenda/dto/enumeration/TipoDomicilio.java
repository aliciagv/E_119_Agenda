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
public enum TipoDomicilio {
    
    CASA("Casa"),
    TRABAJO("Trabajo"),
    SEGUNDAVIVIENDA("Segunda Vivienda");
    
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    private TipoDomicilio(String tipo) {
        this.tipo = tipo;
    }

  
 
    
    
    
}
