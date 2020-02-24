package com.examples.mensajes_app;

import java.util.Scanner;

public class MensajesService {

    public static void crearMensaje(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();

        System.out.println("Ingrese tu nombre ");
        String nombre = sc.nextLine();

        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);

        MensajesDAO.crearMensajeDB(registro);
    }

    public static void listarMensaje(){
        MensajesDAO.leerMensajesDB();
    }

    public static void borrarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el id del mensaje a borrar");
        int id_mensaje = sc.nextInt();
        MensajesDAO.borrarMensajesDB(id_mensaje);
    }

    public static void editarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el nuevo mensaje");
        String mensaje = sc.nextLine();
        System.out.println("Indica el id del mensaje a editar");
        int id_mensaje = sc.nextInt();

        Mensajes actualizacion = new Mensajes();
        actualizacion.setMensaje(mensaje);
        actualizacion.setId_mensaje(id_mensaje);
        MensajesDAO.actualizarMensajesDB(actualizacion);
    }

}
