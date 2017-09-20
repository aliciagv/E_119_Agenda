/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.agenda.main;

import com.cice.agenda.constants.Constantes;
import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author cice
 */
public final class UtilsDate {
    
    
    private static Date getRandomJoinDate() {
        String sdate = "";
        int yearBegin = 1990;
        int yearEnd = 2016 - yearBegin;
        int mes = (1 + (int) (Math.random() * 12));
        int year = yearBegin + (int) (Math.random() * yearEnd);
        int diahasta;
        switch (mes) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diahasta = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diahasta = 30;
                break;
            case 2:
                if (isBisiesto(year)) {
                    diahasta = 29;
                } else {
                    diahasta = 28;
                }
                break;
            default:
                throw new AssertionError();
        }
        sdate = (1 + (int) (Math.random() * diahasta)) + "-" + mes + "-" + year;

        Date date = null;
        try {
            date = Constantes.sdf.parse(sdate);
        } catch (ParseException ex) {
           
        }
        return date;
    }

    private static boolean isBisiesto(int year) {
        boolean bisiesto = false;
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            bisiesto = true;
        }
        return bisiesto;
    }
    
}
