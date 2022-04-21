package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Terminal {
    public int menu(){
        Scanner scanner = new Scanner(System.in);
        nRegion nregion = nRegion.Mondstadt;
        Elemento elemento = Elemento.Pyro;
        boolean salir = false;
        int ID = 0;
        int mostrar = 0;
        int opcion;
        String nambientacion;
        while(!salir){
            System.out.println("1.Alta");
            System.out.println("2.Baixa");
            System.out.println("3.Modificació");
            System.out.println("4.Llistar");

            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("1.Crear Personaje");
                    System.out.println("2.Crear Region");
                    int opcionx;
                    opcionx = scanner.nextInt();
                    if(opcionx == 1){

                    }else if(opcionx == 2) {
                        int opcion1;
                        int opcionele;
                        ID += 1;
                        System.out.println("Nombre de la region?");
                        System.out.println("1.Mondstadt");
                        System.out.println("2.Liyue");
                        System.out.println("3.Inazuma");
                        System.out.println("4.Sumeru");
                        System.out.println("5.Fontaine");
                        System.out.println("6.Natlan");
                        System.out.println("7.Snezhnaya");
                        System.out.println("8.Khaenriah");
                        opcion1 = scanner.nextInt();
                        if (opcion1 == 1) {
                            System.out.println("Mondstadt");
                            nregion = nRegion.Mondstadt;
                        } else if (opcion1 == 2) {
                            System.out.println("Liyue");
                            nregion = nRegion.Liyue;
                        } else if (opcion1 == 3) {
                            System.out.println("Inazuma");
                            nregion = nRegion.Inazuma;
                        } else if (opcion1 == 4) {
                            System.out.println("Sumeru");
                            nregion = nRegion.Sumeru;
                        } else if (opcion1 == 5) {
                            System.out.println("Fontaine");
                            nregion = nRegion.Fontaine;
                        } else if (opcion1 == 6) {
                            System.out.println("Natlan");
                            nregion = nRegion.Natlan;
                        } else if (opcion1 == 7) {
                            System.out.println("Snezhnaya");
                            nregion = nRegion.Snezhnaya;
                        } else if (opcion1 == 8) {
                            System.out.println("Khaenriah");
                            nregion = nRegion.Khaenriah;
                        } else {
                            System.out.println("Error al elegir la opcion");
                            break;
                        }
                        System.out.println("En que esta ambientado la region?");
                        nambientacion = scanner.nextLine();

                        System.out.println("Elemento de la region?");
                        System.out.println("1.Pyro");
                        System.out.println("2.Hydro");
                        System.out.println("3.Electro");
                        System.out.println("4.Anemo");
                        System.out.println("5.Cryo");
                        System.out.println("6.Dendro");
                        System.out.println("7.Geo");
                        opcionele = scanner.nextInt();
                        if (opcionele == 1) {
                            System.out.println("Pyro");
                            elemento = Elemento.Pyro;
                        } else if (opcionele == 2) {
                            System.out.println("Hydro");
                            elemento = Elemento.Hydro;
                        } else if (opcionele == 3) {
                            System.out.println("Electro");
                            elemento = Elemento.Electro;
                        } else if (opcionele == 4) {
                            System.out.println("Anemo");
                            elemento = Elemento.Anemo;
                        } else if (opcionele == 5) {
                            System.out.println("Cryo");
                            elemento = Elemento.Cryo;
                        } else if (opcionele == 6) {
                            System.out.println("Dendro");
                            elemento = Elemento.Dendro;

                        } else if (opcionele == 7) {
                            System.out.println("Geo");
                            elemento = Elemento.Geo;

                        } else {
                            System.out.println("Error al elegir la opcion");
                            break;
                        }
                        mostrar += 1;
                        System.out.println(ID + " " + nregion + " " + nambientacion + " " + elemento);

                    }else{
                        System.out.println("Error al elegir la opcion");
                        break;
                    }
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
        Region region = new Region(1,nRegion.Mondstadt,"Alemania", Elemento.Anemo, new ArrayList<>());
        return region;
    }
}
