/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
         

         String marca;
         String mensajeFinal = "MARCAS\n";
         int limite;
         
         
        System.out.println("Ingrese limite de marcas");
        limite = entrada.nextInt();
        String[] marcas = new String[limite];

         entrada.nextLine();
        for (int i = 0; i < limite; i++) {
            
            System.out.println("Ingrese marca");
            marca = entrada.nextLine();
            marcas[i] = marca;
            String letra = marca.substring(0, 1);
            letra = letra.toUpperCase();
            switch (letra) {
                case "A":
                case "C":
                case "T":
                    i = i - 1;
                    break;
                default:
                    mensajeFinal += String.format("%s\n", marcas[i]);
                    
            }
        }

        System.out.printf("%s", mensajeFinal);

         }
        
    }


