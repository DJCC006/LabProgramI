/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_semana1_ejercicio4;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Lab_Semana1_Ejercicio4 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        lea.useDelimiter("\n");
        double salario;
        boolean deudas=false;
        boolean VIP=false;
        
        System.out.println("Pofavor indique la cantidad de su salario mensual: ");
        salario= lea.nextDouble();
        System.out.println("\n¿Tiene alguna deuda (true/false)?");
        String opcion=lea.next();
        if(opcion.equalsIgnoreCase("true")){
            deudas=true;
        }else if(opcion.equalsIgnoreCase("false")){
            deudas=false;
        }
        
        //OPCION EXTENSION
        System.out.println("\n¿Es cliente VIP? (true/false)");
        String opcion2=lea.next();
        if(opcion2.equalsIgnoreCase("true")){
            VIP=true;
        }else if(opcion2.equalsIgnoreCase("false")){
            VIP=false;
        }
        
        if(salario>2000 && deudas==false){
            System.out.println("\nCREDITO APROBADO");
        }else{
            System.out.println("\nNO SE HA APROBADO EL CREDITO");
        }
        
        //EXTENSION
        if(VIP==true){
            System.out.println("\nEl cliente es de tipo VIP");
        }else{
            System.out.println("\nEl cliente es de tipo normal");
        }
        
                
        
        
        
        
        
    }
}
