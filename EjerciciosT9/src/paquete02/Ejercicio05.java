/*
Generar una solución que permita ingresar los valor de ventas de un vendedor
por cada día de la semana (lunes a viernes); donde día 0 es Lunes.

Usar 2 arreglos.

(ventas(5),i[0-n])  // arreglo que debe ser llenado por el usuario


(dias(5), x(20)[{a-z}, {BS}])
dias[0]<-- "Lunes"
dias[1]<-- "Martes"
dias[2]<-- "Miércoles"
dias[3]<-- "Jueves"
dias[4]<-- "Viernes"
Luego presentar un reporte así

- Lunes $130
- Martes $200
- Miércoles $190
- Jueves $200
- Viernes $100
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] ventas = new int[5];
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        String mensajeFinal = "";

        for (int i = 0; i < dias.length; i++) {
            System.out.print("Ingrese ventas del dia " + dias[i] + ":\n");
            ventas[i] = entrada.nextInt();
        }
        
        mensajeFinal = String.format("%s--- REPORTE SEMANAL ---\n",
                mensajeFinal);
        
        for (int i = 0; i < dias.length; i++) {
            mensajeFinal = String.format("%s-%s: $%s\n",
                    mensajeFinal,
                    dias[i],
                    ventas[i]);
        }
        System.out.print(mensajeFinal);
    }
}
