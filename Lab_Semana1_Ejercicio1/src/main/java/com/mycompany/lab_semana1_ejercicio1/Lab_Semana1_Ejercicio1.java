/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_semana1_ejercicio1;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Lab_Semana1_Ejercicio1 {

    public static void main(String[] args) {
        String nombre;
        String puesto;
        Scanner lea = new Scanner(System.in);
        lea.useDelimiter("\n");
        
        System.out.println("Porfavor ingrese su nombre: ");
        nombre=lea.next();
        System.out.println("\nPorfavor ingrese el puesto que ocupa: ");
        puesto= lea.next();
        
        System.out.println("\nBienvenido "+nombre+", su puesto es "+puesto);
        
        //Extension
        System.out.println("\n***EXTENSION***");
        System.out.println("\nBienvenido "+nombre.toUpperCase()+", su puesto es "+puesto);
        System.out.println("La longitud del nombre es: "+nombre.length());

        
        
        
    }
}
