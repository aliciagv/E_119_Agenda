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

    public String mostrarInfo() {
        StringBuilder info = null;
        //añadimos dirección
        if (direccion != null) {
            info.append(info.append("La dirección es: ").append(direccion));
        }
        //añadimos número
        if (número != null) {
            if (info != null) {
                info.append(" ");
            }
            info.append("El número es: ").append(número);
        }
        //añadimos municipio
        if (municipio != null) {
            if (info != null) {
                info.append(" ");
            }
            System.out.println("El municipio es: " + municipio);
        }
        //añadimos provincia
        if (provincia != null) {
            if (info != null) {
                info.append(" ");
            }
            System.out.println("La provincia es: " + provincia);
        }
        return info.toString();
    }

}
