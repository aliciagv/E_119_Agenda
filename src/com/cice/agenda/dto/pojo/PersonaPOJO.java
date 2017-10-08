/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.agenda.dto.pojo;
//POJO: Plain Old Java Object

import com.cice.agenda.business.IIncluidaDifusion;
import com.cice.agenda.constants.Constantes;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author cice
 */
public class PersonaPOJO implements Comparable<PersonaPOJO> {

    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private Date fechaNacimiento;
    
    
    public PersonaPOJO() {
    }

    public PersonaPOJO(String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void mostrarInfo() {
        
        System.out.println("=====================================================");
        System.out.println("El nombre es: " + nombre + " " + primerApellido + " " + segundoApellido);
        if (fechaNacimiento != null) {
            System.out.println("La fecha de nacimiento es: " + Constantes.sdf.format(fechaNacimiento));
        }

    }
    
    public void mostrarNombreCompleto(){
         System.out.println(" " + nombre + " " + primerApellido + " " + segundoApellido);
    }

    @Override
    public int compareTo(PersonaPOJO persona) {
        if (persona.nombre.equalsIgnoreCase(nombre)
                && persona.primerApellido.equalsIgnoreCase(this.primerApellido) 
                    && persona.segundoApellido.equalsIgnoreCase(segundoApellido)) {
            return 0;
        }
        else {
            return 1;
        }

    }
}


