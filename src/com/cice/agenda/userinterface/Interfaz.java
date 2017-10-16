/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.agenda.userinterface;

import com.cice.agenda.business.impl.AgendaImpl;
import com.cice.agenda.business.impl.Difusion;
import com.cice.agenda.business.impl.ListaDifusionImpl;
import com.cice.agenda.business.impl.NoDifusion;
import com.cice.agenda.constants.Constantes;
import com.cice.agenda.dto.ContactoPersonalDTO;
import com.cice.agenda.dto.ContactoProfesionalDTO;
import com.cice.agenda.dto.enumeration.TipoEmail;
import com.cice.agenda.dto.pojo.DireccionPOJO;
import com.cice.agenda.exceptions.ContactoExistenteException;
import com.cice.agenda.exceptions.DeleteException;
import com.cice.agenda.exceptions.ListaExistenteException;
import com.cice.agenda.exceptions.NotValidFormatException;
import com.cice.agenda.utils.Validator;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
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
    private ListaDifusionImpl listadifusion = new ListaDifusionImpl();

    public void iniciar() {

        mostrarMenu();
    }

    private void mostrarMenu() {

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
            System.out.println("==================================");
            System.out.println("===========   AGENDA   ===========");
            System.out.println("==================================");
            System.out.println("Elige la opción: ");
            System.out.println("1. Mostrar contactos de la agenda");
            System.out.println("2. Mostrar contactos por coincidencia de nombre o apellido");
            System.out.println("3. Mostrar listas de difusión");
            System.out.println("4. Crear contactos");
            System.out.println("5. Crear listas de difusión");
            System.out.println("6. Añadir contacto a lista de difusión");
            System.out.println("7. Editar contactos");
            System.out.println("8. Editar lista de difusión");
            System.out.println("9. Eliminiar contacto");
            System.out.println("10. Eliminar lista de difusión");
            System.out.println("0. Salir");
            System.out.println("==================================");
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
                        buscar();
                    case 3:
                        listadifusion.mostrarInfo();
                        break;
                    case 4: {
                        try {
                            crearContacto();
                        } catch (ContactoExistenteException ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    break;
                    case 5:

                        try {
                            crearListaDifusion();
                        } catch (ListaExistenteException ex) {
                            System.out.println(ex.getMessage());
                        }
                        break;
                    case 6:

                        break;
                    case 9:

                        try {
                            eliminar();
                        } catch (DeleteException ex) {
                            System.out.println(ex.getMessage());
                        }
                        break;
                    default:
                        System.out.println("ERROR:Debe elegir un número del listado");
                        sc.next();
                        opcion = 1;
                }

            } catch (InputMismatchException ime) {
                System.out.println("ERROR:Debe elegir un número");
                sc.next();
                opcion = 1;
            }

        } while (opcion != 0);

    }

    private void crearEmail(ContactoPersonalDTO personaDTO) {
        String opcion = "Y";
        int tipo = 0;
        HashMap<String, String> hm_email = new HashMap<String, String>();

        do {
            System.out.print("Introduce el email: ");
            String semail = sc.nextLine();
            try {
                Validator.validate(semail, Constantes.PATTERN_EMAIL);
                System.out.println("¿El email es personal o profesonial? ");
                System.out.println("1. Personal");
                System.out.println("2. Profesional");
                tipo = sc.nextInt();
                switch (tipo) {
                    case 1:
                    case 2:
                        if (tipo == 1 && hm_email.containsKey(TipoEmail.PER.getTipo()) || (tipo == 2 && hm_email.containsKey(TipoEmail.PRO.getTipo()))) {
                            System.out.println("Ya existe un email personal para este contacto, ¿quiere sobreescribirlo?: Y/N ");
                            if (sc.nextLine().equalsIgnoreCase("Y")) {
                                if (tipo == 1) {
                                    hm_email.put(TipoEmail.PER.getTipo(), semail);
                                } else {
                                    hm_email.put(TipoEmail.PRO.getTipo(), semail);
                                }
                            }
                        } else {
                            if (tipo == 1) {
                                hm_email.put(TipoEmail.PER.getTipo(), semail);
                            } else {
                                hm_email.put(TipoEmail.PRO.getTipo(), semail);
                            }
                        }

                        break;

                    default:
                        System.out.println("ERROR, El tipo elegido es incorrecto.");
                        sc.nextLine();
                }

            } catch (NotValidFormatException nvfe) {
                System.out.println(new NotValidFormatException(NotValidFormatException.ERR_CODE_EMAIL));

            } catch (InputMismatchException ime) {
                System.out.println("ERROR, El tipo elegido es incorrecto.");
            }

            System.out.print("¿Quiere introducir otro email? Y/N: ");
            opcion = sc.nextLine();
        } while (opcion.equalsIgnoreCase("Y") && (hm_email.isEmpty() || hm_email.size() < 2));
        personaDTO.setEmail(hm_email);
    }

    private void crearContacto() throws ContactoExistenteException {

        ContactoPersonalDTO personaDTO = new ContactoPersonalDTO();
        sc.nextLine();
        System.out.print("Introduce el nombre: ");
        personaDTO.setNombre(sc.nextLine());
        System.out.print("Introduce el primer apellido: ");
        personaDTO.setPrimerApellido(sc.nextLine());
        System.out.print("Introduce el segundo apellido: ");
        personaDTO.setSegundoApellido(sc.nextLine());
        if (!agenda.contactoExistente(personaDTO)) {

            System.out.print("Introduce la fecha de nacimiento dd-MM-yyyy ");
            try {
                personaDTO.setFechaNacimiento(Constantes.sdf.parse(sc.nextLine()));
            } catch (ParseException ex) {
                System.out.println("ERROR:El formato de la fecha es incorrecto y no ha sido asignada");
            }
            this.crearEmail(personaDTO);
            System.out.println("El contacto a añadir, ¿ tiene permisos para ser incluido en listas de difusión?  Y:N");
            if (sc.nextLine().equalsIgnoreCase("Y")) {
                personaDTO.setIincluirdifusion(new Difusion());
            } else {
                personaDTO.setIincluirdifusion(new NoDifusion());
            }

            System.out.println("¿El contacto a añadir es un contacto profesional? Y:N");
            if (sc.nextLine().equalsIgnoreCase("Y")) {

                ContactoProfesionalDTO contactoProfesional = new ContactoProfesionalDTO();
                contactoProfesional.setNombre(personaDTO.getNombre());
                asignacionContactoProfesional(contactoProfesional, personaDTO);
                System.out.print("Introduce el cif: ");
                contactoProfesional.setCif(sc.nextLine());
                System.out.print("Introduce el sector: ");
                contactoProfesional.setSector(sc.nextLine());
                System.out.print("Introduce la direccion: ");

                DireccionPOJO direccion = new DireccionPOJO();

                direccion.setDireccion(sc.nextLine());
                System.out.print("Introduce el número: ");
                direccion.setNúmero(sc.nextLine());
                System.out.print("Introduce el municipio: ");

                direccion.setMunicipio(sc.nextLine());
                System.out.print("Introduce la provincia: ");
                direccion.setProvincia(sc.nextLine());
                System.out.print("Introduce el código postal: ");
                direccion.setCodigoPostal(sc.nextLine());
                agenda.agregar(contactoProfesional);

            } else {

                agenda.agregar(personaDTO);
            }
        } else {
            throw new ContactoExistenteException(ContactoExistenteException.ERROR_CODE);
            //System.out.println("ERROR: El contacto ya existe");
        }

    }

    private void asignacionContactoProfesional(ContactoProfesionalDTO contactoProfesional, ContactoPersonalDTO personaDTO) {
        contactoProfesional.setNombre(personaDTO.getNombre());
        contactoProfesional.setPrimerApellido(personaDTO.getPrimerApellido());
        contactoProfesional.setSegundoApellido(personaDTO.getSegundoApellido());
        contactoProfesional.setFechaNacimiento(personaDTO.getFechaNacimiento());
    }

    private void buscar() {
        sc.nextLine();
        System.out.println("Escribe un nombre u apellido para buscar en la agenda");
        agenda.buscarContactosByNombreApellido(sc.nextLine());

    }

    private void eliminar() throws DeleteException {
        try {
            sc.nextLine();
            System.out.println("Escribe el nombre a eliminar:");
            ArrayList<ContactoPersonalDTO> lcontactocoincidencia = agenda.buscarContactosByNombre(sc.nextLine());
            if (lcontactocoincidencia.size() > 0) {

                try {
                    System.out.println("Elige el contacto a eliminar:");
                    agenda.mostrarCoincidencias(lcontactocoincidencia);
                    int select = sc.nextInt();
                    if (select > 0 && select <= lcontactocoincidencia.size()) {
                        agenda.eliminar(lcontactocoincidencia.get(select--));
                        System.out.println("Se ha eliminado el contacto");
                    } else {
                        System.out.println("La opción elegida es incorrecta");
                    }
                } catch (InputMismatchException ime) {
                    System.out.println("La opción elegida es incorrecta");

                }

            } else {
                System.out.println("No existe ningún nombre coincidente en la agenda para eliminar");
            }
        } catch (Exception e) {
            throw new DeleteException(DeleteException.ERR_CODE_EMAIL);
        }
    }

    private void crearListaDifusion() throws ListaExistenteException {
        sc.nextLine();
        System.out.println("Escribe el nombre de la lista");
        String nombreLista = sc.nextLine();
        if (!listadifusion.existeListaDifusion(nombreLista)) {
            listadifusion.crearListaDifusion(nombreLista);
            System.out.println("La lista ha sido creada correctamente");
        } else {
            throw new ListaExistenteException(ListaExistenteException.ERROR_CODE);
        }

    }

    private void anadirContactosListaDifusion() {
        sc.nextLine();

        if (!agenda.isEmpty()) {
            System.out.println("Elige un contacto a añadir");
            agenda.mostrarListadoAgenda();
        }

    }
}
