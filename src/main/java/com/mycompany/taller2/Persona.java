/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.taller2;

import java.util.HashMap;

/**
 *
 * @author orlan
 */
public class Persona {
    private int documento;
    private String nombre, apellido;
    private HashMap<Integer,Persona> datos;

    public Persona(int documento, String nombre, String apellido) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        datos=new HashMap<>();
    }

    public int getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public HashMap<Integer, Persona> getDatos() {
        return datos;
    }
    
}
