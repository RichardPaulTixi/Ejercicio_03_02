/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_03_02;

/**
 *
 * @author HP
 */
public class Ejercicio_03_02 {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        var v1= new Ventana1("Inscripcion");
        v1.setVisible(true);
        
        var v2= new Ventana2("Datos Personales");
        v2.setVisible(true);
        
        var v3= new Ventana3("Informacion de Carrera");
        v3.setVisible(true);
        
        var v4= new Ventana4("Crear Cupo");
        v4.setVisible(true);
        
        var v5= new Ventana5("");
        v5.setVisible(true);
        
    }
}
