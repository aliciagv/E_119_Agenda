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
public enum TipoTelefono {
    
    FIJO("Fijo"),
    MOVIL("Movil"),
    FIJO_TRABAJO("Fijo trabajo"),
    MOVIL_TRABAJO("Movil trabajo");

    private String tipo;

    public String getTipo() {
        return tipo;
    }

    private TipoTelefono(String tipo) {
        this.tipo = tipo;
    }
}
