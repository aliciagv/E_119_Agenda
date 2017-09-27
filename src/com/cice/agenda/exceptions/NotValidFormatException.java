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
    
    public static final String ERR_CODE_EMAIL="0";
    
    public NotValidFormatException(String code){
        super (MyProperties.getInstance().getMsgAsociado(code));
    }

    public NotValidFormatException() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
