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
public class DeleteException extends AgendaException {
    
    public static final String ERR_CODE_EMAIL="02";
    public static final String DEFAULT_ERROR="El contacto no ha podido ser eliminado";

    public DeleteException() {
       super(DEFAULT_ERROR);
    }

    public DeleteException(String code) {
      super (obtenerMsgAsociado(code)!=null?obtenerMsgAsociado(code):DEFAULT_ERROR);    
    }
    
    
    
}
