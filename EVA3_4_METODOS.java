/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_metodos;

import java.util.Scanner;

/**
 *
 * @author flac3
 */
public class EVA3_4_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("mayor de 15 y 100 ="+buscarMayor(15,100));
        // TODO code application logic here
    }
    public static int buscarMayor(int num1,int num2){
    if (num1>num2){
        return num1;
    }else{
        return num2;
        
        
        
     }
    
    }          
    public static String diaSemana(int dia){
      switch(dia){
          case 1:
              return "lunes";
          case 2:
              return "martes";
          case 3:
              return "miercoles";
          case 4:
              return "jueves";
          case 5:
              return "vienes";
          case 6:
              return "sabado";
          case 7:
              return "domingo"; 
          default:
             return"dia no valido";
      } 
    }
   
}