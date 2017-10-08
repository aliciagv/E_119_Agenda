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
public class ListaExistenteException extends AgendaException {

    public static final String ERROR_CODE="03";
    public static final String DEFAUL_MSG="La lista ya existe";
    public ListaExistenteException() {
    }

    public ListaExistenteException(String message) {
        super(message);
    }
    
    
    
}
