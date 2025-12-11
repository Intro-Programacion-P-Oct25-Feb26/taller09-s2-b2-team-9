/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Diseñe una solución que permita al usuario introducir 10 números en un arreglo, 
luego despliegue cada número y su diferencia a partir del promedio numérico de 
los números introducidos.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double suma = 0;
        double promedio = 0;
        int[] arreglo1 = new int[10];
        double[] promediosFinalesDato = new double[10];
        String mensajeFinal = "";

        for (int i = 0; i < arreglo1.length; i++) {
            System.out.println("Ingrese un valor para el arreglo:");
            arreglo1[i] = entrada.nextInt();

            suma = suma + arreglo1[i];
        }

        promedio = suma / arreglo1.length;

        for (int i = 0; i < arreglo1.length; i++) {

            // Calculamos la diferencia aquí
            promediosFinalesDato[i] = arreglo1[i] - promedio;

            mensajeFinal = String.format("%sDato: %d - Diferencia del promedio: "
                    + "%.2f\n",
                    mensajeFinal,
                    arreglo1[i],
                    promediosFinalesDato[i]);
        }

        System.out.println("Promedio Total: " + promedio);
        System.out.println("---------------------------");
        System.out.printf("%s\n", mensajeFinal);
    }
}

