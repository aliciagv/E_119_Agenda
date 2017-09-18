package com.cice.agenda.dto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cice
 */
public class ContactoProfesionalDTO extends ContactoPersonalDTO {


    private String cif;
    private String sector;

    public ContactoProfesionalDTO() {
    }


    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

}
