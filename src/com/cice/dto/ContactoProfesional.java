/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.dto;

import java.util.Date;

/**
 *
 * @author cice
 */
public class ContactoProfesional extends Contactos {
    
    private String cif;
    private String direccionFiscal;
    private String sector;

    public ContactoProfesional() {
    }

    public ContactoProfesional(String nombre, String primerApellido, String segundoApellido, String telefono1, String telefono2, String direccionPostal, String email, Date cumpleanos) {
        super(nombre, primerApellido, segundoApellido, telefono1, telefono2, direccionPostal, email, cumpleanos);
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getDireccionFiscal() {
        return direccionFiscal;
    }

    public void setDireccionFiscal(String direccionFiscal) {
        this.direccionFiscal = direccionFiscal;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
    
    
    
    
    
}
