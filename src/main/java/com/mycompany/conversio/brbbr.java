/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.conversio;
import java.util.Scanner;
/**
 *
 * @author DAM
 */
public class brbbr {

  
             
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introdueix en €");
        int valor_euros = sc.nextInt();
                
        double tipus_de_canvi = 0.85d;
        System.out.println(valor_euros + " eur0s (€) acatualmentt equivalen a" + (valor_euros * tipus_de_canvi) + " lliures esterlines (£)");
        
    }
}

    

