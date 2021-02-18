/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber1deprogramacion2;

import java.util.Scanner;
public class Deber1deprogramacion2 {

   public static void main(String[] args) {
      
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Ingresar primer número:");
        int num1=scn.nextInt();
        System.out.println("Ingresar segundo número:");
        int num2=scn.nextInt();
        System.out.println("Ingresar tercer número:");
        int num3=scn.nextInt();
       
       if (num1<num2 && num2<num3){
           System.out.println("Menor a mayor:"+num1+", "+num2+", "+num3);
       }else if(num1<num3 && num3<num2){
           System.out.println("Menor a mayor: "+num1+", "+num3+", "+num2);
       }else if (num2<num1 && num1<num3){
            System.out.println("Menor a mayor: "+num2+", "+num1+", "+num3);
       }else if (num2<num3 && num3<num1){
            System.out.println("Menor a mayor: "+num2+", "+num3+", "+num1);
       }else if (num3<num1 && num1<num2){
            System.out.println("Menor a mayor: "+num3+", "+num1+", "+num2);
       }else if (num3<num2 && num2<num1){
            System.out.println("Menor a mayor: "+num3+", "+num2+", "+num1);
       }
   }
}
