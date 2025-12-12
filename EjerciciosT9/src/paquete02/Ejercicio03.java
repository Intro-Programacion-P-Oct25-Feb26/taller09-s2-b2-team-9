/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        // para entender mejor donde esta la media {1, 2, 3, 4, 9, 10, 10, 11, 12, 12, 13, 16, 21}
        double suma = 0;
        int contador = 0;
        String mensajeFinal = "";

        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
            contador = contador + 1;

        }
        suma = suma / contador;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > suma) {

                mensajeFinal += String.format("%d Arriba de la media\n", arreglo[i]);
            } else {
                mensajeFinal += String.format("%d Debajo de la media\n", arreglo[i]);
            }

        }
        System.out.printf("Media aritmetica %.1f\n"
                + "Lista de numeros\n"
                + "%s", suma,mensajeFinal);
    }

}

