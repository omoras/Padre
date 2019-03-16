/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.taller2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author orlan
 */
public class Menu {

    public HashMap<Integer, Persona> mapaAbuelo;

    public void agregarDatos(){
        mapaAbuelo = new HashMap<>();
        mapaAbuelo.put(1, new Persona(1, "Juan", "Galindo"));
        mapaAbuelo.put(2, new Persona(2, "Carlos", "Ordoñez"));
        mapaAbuelo.get(1).getDatos().put(12, new Persona(12, "Manuel", "Galindo"));
        mapaAbuelo.get(1).getDatos().put(13, new Persona(13, "Samuel", "Galindo"));
        mapaAbuelo.get(2).getDatos().put(14, new Persona(14, "Cesar", "Ordoñez"));
        mapaAbuelo.get(2).getDatos().put(15, new Persona(15, "Diego", "Ordoñez"));
        mapaAbuelo.get(1).getDatos().get(12).getDatos().put(101, new Persona(101, "Juan Manuel", "Galindo"));
        mapaAbuelo.get(1).getDatos().get(12).getDatos().put(102, new Persona(102, "Jose Manuel", "Galindo"));
        mapaAbuelo.get(1).getDatos().get(13).getDatos().put(103, new Persona(103, "Samuel Ignacio", "Galindo"));
        mapaAbuelo.get(1).getDatos().get(13).getDatos().put(104, new Persona(104, "Samuel Alejandro", "Galindo"));
        mapaAbuelo.get(2).getDatos().get(14).getDatos().put(110, new Persona(110, "Cesar Leonardo", "Ordoñez"));
        mapaAbuelo.get(2).getDatos().get(14).getDatos().put(111, new Persona(111, "Cesar Alejandro", "Ordoñez"));
        mapaAbuelo.get(2).getDatos().get(15).getDatos().put(112, new Persona(112, "Diego Alejandro", "Ordoñez"));
        mapaAbuelo.get(2).getDatos().get(15).getDatos().put(113, new Persona(113, "Diego Julian", "Ordoñez"));   
    }
    public void datoConsola(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el codigo que desea buscar:");
        int codigo = sc.nextInt();
        System.out.println(buscar(codigo));
    }
    public String buscar(int codigo){
        String datos = null;
        if (mapaAbuelo.containsKey(codigo)) {
            datos = "Soy: " + mapaAbuelo.get(codigo).getNombre() + " " + mapaAbuelo.get(codigo).getApellido()
                    + " y soy Papa de :";

            Iterator it = mapaAbuelo.get(codigo).getDatos().keySet().iterator();
            while (it.hasNext()) {
                int i = Integer.parseInt(it.next().toString());
                datos+=mapaAbuelo.get(codigo).getDatos().get(i).getNombre() + " "
                        + mapaAbuelo.get(codigo).getDatos().get(i).getApellido() + ".";

                datos+=("Y Abuelo de: ");
                Iterator itera = mapaAbuelo.get(codigo).getDatos().get(i).getDatos().keySet().iterator();
                while (itera.hasNext()) {
                    int j = Integer.parseInt(itera.next().toString());
                    datos+=(mapaAbuelo.get(codigo).getDatos().get(i).getDatos().get(j).getNombre() + " "
                            + mapaAbuelo.get(codigo).getDatos().get(i).getDatos().get(j).getApellido());
                }
            }
        } else {
            Iterator it = mapaAbuelo.keySet().iterator();
            while (it.hasNext()) {
                int i = Integer.parseInt(it.next().toString());
                if (mapaAbuelo.get(i).getDatos().containsKey(codigo)) {
                    datos+=("Soy: " + mapaAbuelo.get(i).getDatos().get(codigo).getNombre() + " "
                            + mapaAbuelo.get(i).getDatos().get(codigo).getApellido() + " Mi papa es : "
                            + mapaAbuelo.get(i).getNombre()+" "+mapaAbuelo.get(i).getApellido()+" y mis hijos son: ");
                    
                    
                    Iterator itera = mapaAbuelo.get(i).getDatos().get(codigo).getDatos().keySet().iterator();
                    
                    while (itera.hasNext()) {
                        int j = Integer.parseInt(itera.next().toString());
                        datos+=(mapaAbuelo.get(i).getDatos().get(codigo).getDatos().get(j).getNombre() + " "
                                + mapaAbuelo.get(i).getDatos().get(codigo).getDatos().get(j).getApellido());
                    }
                } else {
                    Iterator itera = mapaAbuelo.get(i).getDatos().keySet().iterator();
                    while (itera.hasNext()) {
                        int j = Integer.parseInt(itera.next().toString());
                        if (mapaAbuelo.get(i).getDatos().get(j).getDatos().containsKey(codigo)) {
                            datos+=("Soy " + mapaAbuelo.get(i).getDatos().get(j).getDatos().get(codigo).getNombre()
                                    + " " + mapaAbuelo.get(i).getDatos().get(j).getDatos().get(codigo).getApellido() +
                                    " soy Hijo de:"+mapaAbuelo.get(i).getDatos().get(j).getNombre()+" "
                                    +mapaAbuelo.get(i).getDatos().get(j).getApellido()+"\n y nieto de: "+mapaAbuelo.get(i).getNombre()+
                                    " "+mapaAbuelo.get(i).getApellido());
                        }
                    }
                }
            }
        }
        return datos;
    }
    public void Menu() {

        mapaAbuelo = new HashMap<>();
        mapaAbuelo.put(1, new Persona(1, "Juan", "Galindo"));
        mapaAbuelo.put(2, new Persona(2, "Carlos", "Ordoñez"));
        mapaAbuelo.get(1).getDatos().put(12, new Persona(12, "Manuel", "Galindo"));
        mapaAbuelo.get(1).getDatos().put(13, new Persona(13, "Samuel", "Galindo"));
        mapaAbuelo.get(2).getDatos().put(14, new Persona(14, "Cesar", "Ordoñez"));
        mapaAbuelo.get(2).getDatos().put(15, new Persona(15, "Diego", "Ordoñez"));
        mapaAbuelo.get(1).getDatos().get(12).getDatos().put(101, new Persona(101, "Juan Manuel", "Galindo"));
        mapaAbuelo.get(1).getDatos().get(12).getDatos().put(102, new Persona(102, "Jose Manuel", "Galindo"));
        mapaAbuelo.get(1).getDatos().get(13).getDatos().put(103, new Persona(103, "Samuel Ignacio", "Galindo"));
        mapaAbuelo.get(1).getDatos().get(13).getDatos().put(104, new Persona(104, "Samuel Alejandro", "Galindo"));
        mapaAbuelo.get(2).getDatos().get(14).getDatos().put(110, new Persona(110, "Cesar Leonardo", "Ordoñez"));
        mapaAbuelo.get(2).getDatos().get(14).getDatos().put(111, new Persona(111, "Cesar Alejandro", "Ordoñez"));
        mapaAbuelo.get(2).getDatos().get(15).getDatos().put(112, new Persona(112, "Diego Alejandro", "Ordoñez"));
        mapaAbuelo.get(2).getDatos().get(15).getDatos().put(113, new Persona(113, "Diego Julian", "Ordoñez"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el codigo que desea buscar:");
        int codigo = sc.nextInt();

        if (mapaAbuelo.containsKey(codigo)) {
            System.out.println("Soy: " + mapaAbuelo.get(codigo).getNombre() + " " + mapaAbuelo.get(codigo).getApellido()
                    + " y soy Papa de :");

            Iterator it = mapaAbuelo.get(codigo).getDatos().keySet().iterator();
            while (it.hasNext()) {
                int i = Integer.parseInt(it.next().toString());
                System.out.println(mapaAbuelo.get(codigo).getDatos().get(i).getNombre() + " "
                        + mapaAbuelo.get(codigo).getDatos().get(i).getApellido() + ".");

                System.out.println("Y Abuelo de: ");
                Iterator itera = mapaAbuelo.get(codigo).getDatos().get(i).getDatos().keySet().iterator();
                while (itera.hasNext()) {
                    int j = Integer.parseInt(itera.next().toString());
                    System.out.println(mapaAbuelo.get(codigo).getDatos().get(i).getDatos().get(j).getNombre() + " "
                            + mapaAbuelo.get(codigo).getDatos().get(i).getDatos().get(j).getApellido());
                }
            }
        } else {
            Iterator it = mapaAbuelo.keySet().iterator();
            while (it.hasNext()) {
                int i = Integer.parseInt(it.next().toString());
                if (mapaAbuelo.get(i).getDatos().containsKey(codigo)) {
                    System.out.println("Soy: " + mapaAbuelo.get(i).getDatos().get(codigo).getNombre() + " "
                            + mapaAbuelo.get(i).getDatos().get(codigo).getApellido() + " Mi papa es : "
                            + mapaAbuelo.get(i).getNombre()+" "+mapaAbuelo.get(i).getApellido()+" y mis hijos son: ");
                    
                    
                    Iterator itera = mapaAbuelo.get(i).getDatos().get(codigo).getDatos().keySet().iterator();
                    
                    while (itera.hasNext()) {
                        int j = Integer.parseInt(itera.next().toString());
                        System.out.println(mapaAbuelo.get(i).getDatos().get(codigo).getDatos().get(j).getNombre() + " "
                                + mapaAbuelo.get(i).getDatos().get(codigo).getDatos().get(j).getApellido());
                    }
                } else {
                    Iterator itera = mapaAbuelo.get(i).getDatos().keySet().iterator();
                    while (itera.hasNext()) {
                        int j = Integer.parseInt(itera.next().toString());
                        if (mapaAbuelo.get(i).getDatos().get(j).getDatos().containsKey(codigo)) {
                            System.out.println("Soy " + mapaAbuelo.get(i).getDatos().get(j).getDatos().get(codigo).getNombre()
                                    + " " + mapaAbuelo.get(i).getDatos().get(j).getDatos().get(codigo).getApellido() +
                                    " soy Hijo de:"+mapaAbuelo.get(i).getDatos().get(j).getNombre()+" "
                                    +mapaAbuelo.get(i).getDatos().get(j).getApellido()+"\n y nieto de: "+mapaAbuelo.get(i).getNombre()+
                                    " "+mapaAbuelo.get(i).getApellido());
                        }
                    }
                }
            }
        }
    }

}
