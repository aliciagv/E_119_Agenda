package com.cice.agenda.dto;

import com.cice.agenda.dto.pojo.DireccionPOJO;

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
    private DireccionPOJO direccionFiscal;

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
    
    @Override
     public void mostrarInfo(){
         super.mostrarInfo();
         if (cif!=null)
            System.out.println("El cif es: "+cif);
         if (sector!=null)
            System.out.println("El sector es: "+ sector); 
         if (direccionFiscal!=null){
             String sdireccionFiscal=direccionFiscal.mostrarInfo();
             if (sdireccionFiscal!=null){
                 System.out.println("La dirección fiscal es: "+ sdireccionFiscal);
             }
             
         }
     }

}
