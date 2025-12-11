/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* Lo que este programa hace en es que en base a los posiciones dadas en el arreglo
busca cuantas de estas posiciones estan dentro de los rangos dados*/
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        String[] rangos =       {"1-5", "6-10", "11-15", "16-20"};
        int[] valoresRangos =   {10,      20,     3,        1}    
        */
        int[] respuestas = {1, 10, 11, 12, 12, 13, 16, 17, 18, 8, 9, 10, 19, 20};
        String[] rangos = {"1-5", "6-10", "11-15", "16-20"};
        int[] valoresRangos = new int[4]; // {0, 0, 0, 0}
        int respuesta;
        
        for (int i = 0; i < respuestas.length; i++) { 
            respuesta = respuestas[i]; 
                    
            if ((respuesta >= 1) && (respuesta <=5)){
                valoresRangos[0] = valoresRangos[0] + 1;
                
            }else{
                    
                if ((respuesta >= 6) && (respuesta <=10)){
                    valoresRangos[1] = valoresRangos[1] + 1;
                }else{
                            
                    if ((respuesta >= 11) && (respuesta <=15)){
                        valoresRangos[2] = valoresRangos[2] + 1; //3+1 
                    }else{
                        if ((respuesta >= 16) && (respuesta <=20)){
                            valoresRangos[3] = valoresRangos[3] + 1;//1+1
                        }
                    
                    }
                }
                
            }
        }
        
        
        for (int i = 0; i < rangos.length; i++) {
            System.out.printf("Rango %s - valor %d\n", rangos[i],
                    valoresRangos[i]);
        }
        
    }
    
    
}