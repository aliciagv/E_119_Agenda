/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.agenda.business;

import com.cice.agenda.dto.pojo.PersonaPOJO;




/**
 *
 * @author cice
 */
public interface IAgenda {
    
    public void agregar(PersonaPOJO c);
    public void editar(PersonaPOJO c);
    public void eliminar(PersonaPOJO c);
    public void mostrar();
    public void buscarContactosByNombreApellido();
    
    
}
