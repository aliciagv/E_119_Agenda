/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.agenda.dto.pojo;

/**
 *
 * @author cice
 */
public class DireccionPOJO {
    
    private String direccion;
    private String número;
    private String municipio;
    private String provincia;
    private String codigoPostal;

    public DireccionPOJO(String direccion, String número, String municipio, String provincia, String codigoPostal) {
        this.direccion = direccion;
        this.número = número;
        this.municipio = municipio;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNúmero() {
        return número;
    }

    public void setNúmero(String número) {
        this.número = número;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
    
    
    
}
