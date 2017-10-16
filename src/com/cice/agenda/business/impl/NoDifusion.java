/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.agenda.business.impl;

import com.cice.agenda.business.IIncluidaDifusion;

/**
 *
 * @author Alicia
 */
public class NoDifusion implements IIncluidaDifusion{

    @Override
    public boolean incluirDifusion() {
        return true;
    }
    
}
