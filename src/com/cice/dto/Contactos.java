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
public class Contactos {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String telefono1;
    private String telefono2;
    private String direccionPostal;
    private String email;
    private Date cumpleanos;

    public Contactos() {
    }

    public Contactos(String nombre, String primerApellido, String segundoApellido, String telefono1, String telefono2, String direccionPostal, String email, Date cumpleanos) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.direccionPostal = direccionPostal;
        this.email = email;
        this.cumpleanos = cumpleanos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getDireccionPostal() {
        return direccionPostal;
    }

    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCumpleanos() {
        return cumpleanos;
    }

    public void setCumpleanos(Date cumpleanos) {
        this.cumpleanos = cumpleanos;
    }
    
    
    
   
    
}
