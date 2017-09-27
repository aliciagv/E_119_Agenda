/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.agenda.utils;

import com.cice.agenda.exceptions.NotValidFormatException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author cice
 */
public final class Validator {
    
       public static void validate(String datovalidar,String PATTERN) throws NotValidFormatException {
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher matcher = pattern.matcher(datovalidar);

        if (!matcher.matches()) {
            throw new NotValidFormatException();
        }
        
    }
    
}
