/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.agenda.exceptions;

import com.cice.agenda.config.MyProperties;

/**
 *
 * @author Alicia
 */
public class AgendaException extends Exception {
    
  
    public AgendaException() {
    }

    public AgendaException(String message) {
        super(message);
    }
    
      public static String obtenerMsgAsociado(String code) {
        return MyProperties.getInstance().getMsgAsociado(code);
    }

}
