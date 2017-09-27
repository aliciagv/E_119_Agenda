/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.agenda.userinterface;

import com.cice.agenda.business.impl.AgendaImpl;
import com.cice.agenda.constants.Constantes;
import com.cice.agenda.dto.ContactoPersonalDTO;
import com.cice.agenda.dto.ContactoProfesionalDTO;
import com.cice.agenda.dto.pojo.DireccionPOJO;
import com.cice.agenda.exceptions.NotValidFormatException;
import com.cice.agenda.utils.Validator;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author cice
 */
public class Interfaz {

    Scanner sc = new Scanner(System.in);
    private int opcion = 0;
    private AgendaImpl agenda = new AgendaImpl();

    public void iniciar() {

        mostrarMenu();
    }

    private void mostrarMenu() {
        System.out.println("=================");
        System.out.println("=   AGENDA      =");
        System.out.println("=================");
        getOpcion();

    }

    /*1. Almacenar contactos.
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
 *      lista de difusión*/
    private void getOpcion() {
        do {
            System.out.println("Elige la opción: ");
            System.out.println("1. Mostrar contactos de la agenda");
            System.out.println("2. Mostrar contactos por coincidencia de nombre o apellido");
            System.out.println("3. Mostrar listas de difusión");
            System.out.println("4. Crear contactos");
            System.out.println("5. Crear listas de difusión");
            System.out.println("6. Editar contactos");
            System.out.println("7. Editar lista de difusión");
            System.out.println("8. Eliminiar contacto");
            System.out.println("9. Eliminar lista de difusión");
            System.out.println("");
            try {
                opcion = sc.nextInt();
                switch (opcion) {
                    case 0:
                        System.out.println("Gracias por utilizar la agenda");
                        System.out.println("Hasta pronto!");
                        break;
                    case 1:
                        agenda.mostrar();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        anadir();
                        break;
                    default:
                        throw new AssertionError();
                }

            } catch (InputMismatchException ime) {
                System.out.println("ERROR:Debe elegir un número");
                sc.next();
                opcion = 1;
            }

        } while (opcion != 0);

    }
    
    private void anadirEmail(){
        
    
    
    }

    private void anadir() {


        ContactoPersonalDTO personaPOJO = new ContactoPersonalDTO();
        System.out.print("Introduce el nombre: ");
        personaPOJO.setNombre(sc.nextLine());
        System.out.print("Introduce el primer apellido: ");
        personaPOJO.setPrimerApellido(sc.nextLine());
        System.out.println("Introduce el segundo apellido: ");
        personaPOJO.setSegundoApellido(sc.nextLine());
        System.out.println("Introduce la fecha de nacimiento dd-MM-yyyy");
        try {
            personaPOJO.setFechaNacimiento(Constantes.sdf.parse(sc.nextLine()));
        } catch (ParseException ex) {
            System.out.println("ERROR:El formato de la fecha es incorrecto y no ha sido asignada");
        }
        anadirEmail();
        System.out.print("Introduce el email:");
        String email=sc.nextLine();
        try {
            Validator.validate(email, Constantes.PATTERN_EMAIL);
        } catch (NotValidFormatException ex) {
            
        }
    
        
        System.out.println("¿El contacto a añadir es un contacto profesional? Y:N");
        if (sc.nextLine().equalsIgnoreCase("Y")) {
            
            ContactoProfesionalDTO contactoProfesional = (ContactoProfesionalDTO) personaPOJO;
            
            System.out.print("Introduce el cif:");
            contactoProfesional.setCif(sc.nextLine());
            System.out.print("Introduce el sector:");
            contactoProfesional.setSector(sc.nextLine());
            System.out.print("Introduce la direccion:");
            
            DireccionPOJO direccion = new DireccionPOJO();
            
            direccion.setDireccion(sc.nextLine());
            System.out.print("Introduce el número:");
            direccion.setNúmero(sc.nextLine());
            System.out.print("Introduce el municipio:");
            
            
            direccion.setMunicipio(sc.nextLine());
            System.out.print("Introduce la provincia:");
            direccion.setProvincia(sc.nextLine());
            System.out.print("Introduce el código postal:");
            direccion.setCodigoPostal(sc.nextLine());
                    
        } else {

            agenda.agregar(personaPOJO);
        }

    }

}
