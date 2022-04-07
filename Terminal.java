package com.company;

import java.util.Scanner;

public class Terminal {

    public int menu(){
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while(!salir){
            System.out.println("1.Alta");
            System.out.println("2.Baixa");
            System.out.println("3.Modificació");
            System.out.println("4.Llistar");

            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Error en la ejecucion");
            }
        }
        return menu();
    }
    public Region emplenarRegion(){


        return emplenarRegion();
    }
}
