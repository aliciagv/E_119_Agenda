/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.agenda.exceptions;

import com.cice.agenda.config.MyProperties;

/**
 *
 * @author cice
 */
public class NotValidFormatException extends Exception {
    
    public static final String ERR_CODE_EMAIL="01";
    public static final String FORMAT_ERROR="Formato no válido";
    
    public NotValidFormatException(String code){
        super (obtenerMsgAsociado(code));
        
    }

    public NotValidFormatException() {
        super(FORMAT_ERROR);
      
    }
    private static String obtenerMsgAsociado(String code) {
        return MyProperties.getInstance().getMsgAsociado(code);
    }
    
    
    
}
