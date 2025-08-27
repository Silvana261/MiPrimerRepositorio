package com.mycompany.ejemplo1;

import java.util.Scanner;

public class Ejemplo1 {
    public static boolean validarAlimentos(String alimentoIngresado, int posicion) {
String listaAlimentosEstablecidos[] = new String[10];
        listaAlimentosEstablecidos[0] = "Arroz";
        listaAlimentosEstablecidos[1] = "Papa";
        listaAlimentosEstablecidos[2] = "Yuca";
        listaAlimentosEstablecidos[3] = "Naranjas";
        listaAlimentosEstablecidos[4] = "Pescado";
        listaAlimentosEstablecidos[5] = "Pollo";
        listaAlimentosEstablecidos[6] = "Yogurt";
        listaAlimentosEstablecidos[7] = "Leche";
        listaAlimentosEstablecidos[8] = "Pan";
        listaAlimentosEstablecidos[9] = "Fresas";
    }
    public static void main(String[] args) {

        String alimentosIngresados[]= new String[10];
        Scanner scan = new Scanner(System.in);
        Boolean flag = false;
        int posicion = 0;


        while (flag == false) {
            System.out.println("Ingrese el siguiente alimento: ");
            String alimentoIngresado = scan.next();

            for (int i = 0; i < listaAlimentosEstablecidos.length; i++) {

                if (alimentoIngresado.equals(listaAlimentosEstablecidos[i])) {
                    alimentosIngresados[posicion] = alimentoIngresado;
                    posicion++;
                    break;
                }
            }

            for (int i = 0; i < alimentosIngresados.length; i++) {
                if (alimentosIngresados[posicion] == null) {
                    if (alimentosIngresados[i] == null) {
                        flag = false;
                        break;

                    }
                }
            }

        }
         
         
                
                
        
        
        
        
                
        
    }

        
}
