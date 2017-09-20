/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.agenda.dto;

import com.cice.agenda.dto.pojo.DireccionPOJO;
import com.cice.agenda.dto.pojo.PersonaPOJO;
import java.util.Date;
import java.util.HashMap;
import com.cice.agenda.business.IIncluidaDifusion;

/**
 *
 * @author cice
 */
public class ContactoPersonalDTO extends PersonaPOJO implements IIncluidaDifusion{

    private HashMap<String,String> telefonos;
    private HashMap<String,DireccionPOJO> direccionPostal;
    private HashMap<String,String> email;
    private boolean isIncluidoDifusion;

    public ContactoPersonalDTO() {
    }

    
    
    public ContactoPersonalDTO(HashMap<String, String> telefonos, HashMap<String, DireccionPOJO> direccionPostal, HashMap<String, String> email, String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento) {
        super(nombre, primerApellido, segundoApellido, fechaNacimiento);
        this.telefonos = telefonos;
        this.direccionPostal = direccionPostal;
        this.email = email;
    }
    
    
    
    

    public HashMap<String, String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(HashMap<String, String> telefonos) {
        this.telefonos = telefonos;
    }

    public HashMap<String, DireccionPOJO> getDireccionPostal() {
        return direccionPostal;
    }

    public void setDireccionPostal(HashMap<String, DireccionPOJO> direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    public HashMap<String, String> getEmail() {
        return email;
    }

    public void setEmail(HashMap<String, String> email) {
        this.email = email;
    }

    @Override
    public boolean isIncluidaDifusion() {
        return isIncluidoDifusion;
    }

  



    
    
    
   
    
}
