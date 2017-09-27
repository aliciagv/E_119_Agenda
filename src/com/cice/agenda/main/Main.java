/*
 * EJERCICIO INDIVIDUAL AGENDA JAVA
 * Tenemos que crear una agenda que nos permita:
 * 1. Almacenar contactos.
 *   nombre completo
 *   telefono 1
 *   telefono 2
 *   dirección postal
 *   email
 *   cumpleaños
 * 2. Mostrar los datos de un/varios contacto introduciendo su nombre o primer apellido 
 * 3. Editar y eliminar contactos de mi agenda
 * 4. Agregar nuevos contactos, avisando si ya tengo un contacto con el mismo nombre.
 * 5. Agregar contactos a listas de difusión indicando. No todos son añadidos a estas listas
 * 6. Control de excepciones usando nuestras propias excepciones de los casos 2,3 y 4
 * 7. Posibilitar la creación de contactos profesionales, almacenando cif, direción fiscal y sector
 * 8. Opciones de menu:
 *      mostrar todos
 *      mostrar por coincidencia de nombre o apellido
 *      mostrar listas de difusión
 *      crear contactos
 *      crear listas de difusión
 *      editar contactos
 *      editar listas de difusión
 *      eliminar contacto
 *      lista de difusión
 */
package com.cice.agenda.main;

import com.cice.agenda.userinterface.Interfaz;

/**
 *
 * @author cice
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        runApp();
    }
    
    private static void runApp() {
        Interfaz interfaz =new Interfaz();
        interfaz.iniciar();
    
    }
}
