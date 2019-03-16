/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.taller2.Menu;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c-les
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @Test
    public void testAbueloUno() {
        final String expected="Soy: Juan Galindo y soy Papa de :Manuel Galindo.\n" +"Y Abuelo de: Juan Manuel GalindoJose Manuel GalindoSamuel Galindo.\n" +"Y Abuelo de: Samuel Ignacio GalindoSamuel Alejandro Galindo";
        final Menu m =new Menu();
        m.agregarDatos();
        final String actual= m.buscar(1);
        Assert.assertEquals(expected, actual);
    }
     @Test
    public void testAbueloDos() {
        final String expected="Soy: Carlos Ordoñez y soy Papa de :Cesar Ordoñez.\n" +"Y Abuelo de: Cesar Leonardo OrdoñezCesar Alejandro OrdoñezDiego Ordoñez.\n" +"Y Abuelo de: Diego Alejandro OrdoñezDiego Julian Ordoñez";
        final Menu m =new Menu();
        m.agregarDatos();
        final String actual= m.buscar(2);
        Assert.assertEquals(expected, actual);
    }
     @Test
    public void testPapaDoce() {
        final String expected="Soy: Manuel Galindo Mi papa es : Juan Galindo y mis hijos son: Juan Manuel GalindoJose Manuel Galindo";
        final Menu m =new Menu();
        m.agregarDatos();
        final String actual= m.buscar(12);
        Assert.assertEquals(expected, actual);
    }
      @Test
    public void testNieto() {
        final String expected="Soy Samuel Ignacio Galindo soy Hijo de:Samuel Galindo\n" +" y nieto de: Juan Galindo";
        final Menu m =new Menu();
        m.agregarDatos();
        final String actual= m.buscar(103);
        Assert.assertEquals(expected, actual);
    }
    
}
