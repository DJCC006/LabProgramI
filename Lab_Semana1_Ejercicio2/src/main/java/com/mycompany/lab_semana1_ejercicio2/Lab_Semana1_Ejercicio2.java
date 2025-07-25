/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_semana1_ejercicio2;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Lab_Semana1_Ejercicio2 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        lea.useDelimiter("\n");
        double salarioBase;
        double monto;
        double total;
        double bono;
        
        System.out.println("Introduzca su salario base: ");
        salarioBase=lea.nextDouble();
        System.out.println("\nIntroduzca el monto de ventas: ");
        monto=lea.nextDouble();
        
        if(monto>5000){
            bono=monto*0.10;
            total=salarioBase+bono;
        }else{
            bono=0;
            total=salarioBase+bono;
        }
        
        System.out.println("\nSu salario total es de: "+total);
        
        
        //Extencion
        System.out.println("\n***EXTENCION***");
        if(salarioBase<3000||monto>5000){
            bono=monto*0.10;
            total=salarioBase+bono;
            System.out.println("\nSu salario total es de: "+total);
        }else{
            total=salarioBase;
            System.out.println("\nSu salario total es de: "+total);
        }
        
                
        
    }
}
