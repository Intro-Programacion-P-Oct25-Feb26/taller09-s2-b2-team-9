/*
 Dados los siguientes arreglos

arreglo(3), x(50)[{a-z}, {A-Z}, {1-9}, BS]
arreglo[0] <-- "Café tradicional"
arreglo[1] <-- "Café francés"
arreglo[2] <-- "Café alemán"

arreglo(3),d[0-n]
arreglo[0] <-- 1.5
arreglo[1] <-- 2.1
arreglo[2] <-- 2.3

Generar una solución que permita de forma repetitiva solicitar a un cliente que 
seleccione los productos que desea comprar (hasta que le usuario lo decida). 
Por ejemplo, si el usuario decide comprar café tradicional, se debe preguntar
el número de tazas y calcular el total a pagar por ese pedido solo pedido. 
Al final se debe presentar en una cada acumuladora lo siguiente.

El usuario ha comprado:

  Café tradicional (6 t), valor a cancelar $9
  Café alemán (3 t), valor a cancelar $6.3
  Café francés (2 t), valor a cancelar $4.6

Total a pagar: 19.6
 */
package paquete02;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String[] cafe = {"Café tradicional", "Café francés", "Café alemán"};
        double[] precio = {1.5, 2.1, 2.3};
        int tipo;
        int taza;
        boolean bandera = true;
        String salida;
        double total = 0;
        double sumaFinal = 0;
        String mensaje = "";
        while (bandera) {

            System.out.println("ingrese el tipo de cafe\n0 = Café tradicional"
                    + "\n1 = Café francés\n2 = Café aleman\n-----------------");
            tipo = entrada.nextInt();
            System.out.println("ingrese las tazas que va a comprar");
            taza = entrada.nextInt();
            entrada.nextLine();
            System.out.println("ingrese (no) si termino de ordenar");
            salida = entrada.nextLine();
            if (salida.equals("no")) {
                bandera = false;
            }
            switch (tipo) {
                case 0:
                case 1:
                case 2:
                    total = precio[tipo] * taza;
                    mensaje = String.format("%s%s (%s t), valor a cancelar "
                            + "%.2f\n\t", mensaje,
                            cafe[tipo], taza, total);
                    sumaFinal += total;
                    break;
                default:
                    System.out.println("ingrese un producto que sea valido");
                    break;

            }

        }
        System.out.printf("El usuario ha comprado:\n\n\t%s \nTotal a pagar: "
                + "$%.1f\n", mensaje, sumaFinal);
    }

}
