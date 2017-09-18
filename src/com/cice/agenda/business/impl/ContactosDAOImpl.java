/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.agenda.business.impl;

import com.cice.agenda.business.ContactosDAO;
import com.cice.agenda.dto.pojo.PersonaPOJO;
import java.util.ArrayList;

/**
 *
 * @author cice
 */
public class ContactosDAOImpl implements ContactosDAO{

    ArrayList<PersonaPOJO> lcontacto = new ArrayList<PersonaPOJO>();
    
    public void agregar(PersonaPOJO c) {
        lcontacto.add(c);
    }

    @Override
    public void editar(PersonaPOJO c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(PersonaPOJO c) {
        lcontacto.remove(c);
    }
    
}
