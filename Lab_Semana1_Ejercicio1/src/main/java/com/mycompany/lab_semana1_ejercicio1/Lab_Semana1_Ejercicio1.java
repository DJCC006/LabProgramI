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
        
        System.out.println("Porfavor ingrese su primer nombre y su primer apellido: ");
        nombre=lea.next().toUpperCase();
        System.out.println("\nPorfavor ingrese el puesto que ocupa: ");
        puesto= lea.next();
        
        String mensaje= "\nBienvenido "+nombre+", su puesto es "+puesto;
        int lengthMensaje=mensaje.length();
        
        System.out.println(mensaje);
        System.out.println("El largo de la cadena es: "+lengthMensaje);
        
        
        
    }
}
