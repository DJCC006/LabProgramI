/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_semana1_ejercicio3;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Lab_Semana1_Ejercicio3 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        lea.useDelimiter("\n");
        int stock;
        int cantidad;
        
        System.out.println("Ingrese el stock actual del producto: ");
        stock= lea.nextInt();
        System.out.println("\nIngrese la cantidad requerida del producto: ");
        cantidad=lea.nextInt();
        
        if(stock>cantidad){
            System.out.println("\nPedido aceptado");
        }else{
            System.out.println("\nStock insuficiente");
        }
        
        //Extension
        System.out.println("***EXTENSION***");
        if(stock<5){
            System.out.println("¡Advertencia: Stock Bajo!");
        }
        
        
        
    }
}
