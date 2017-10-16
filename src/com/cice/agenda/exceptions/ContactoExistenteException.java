/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.agenda.exceptions;

/**
 *
 * @author Alicia
 */
public class ContactoExistenteException extends AgendaException {

    public static final String ERROR_CODE_LIST="04";
    public static final String ERROR_CODE="05";
    public static final String DEFAUL_MSG="El contacto ya existe";
    public ContactoExistenteException() {
    }

    public ContactoExistenteException(String message) {
        super(message);
    }
    
    
    
}
