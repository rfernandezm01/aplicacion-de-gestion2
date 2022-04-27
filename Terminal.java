package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Terminal {
    public int menu() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Region> region = new ArrayList<>();
        boolean salir = false;
        nRegion nregion;
        Elemento elemento;
        int ID = 0;
        int perID = 0;
        int mostrar = 0;
        int opcion;
        String nambientacion;
        while (!salir) {
            System.out.println("1.Alta");
            System.out.println("2.Baixa");
            System.out.println("3.Modificació");
            System.out.println("4.Llistar");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("1.Crear Personaje");
                    System.out.println("2.Crear Region");
                    int opcionx;
                    opcionx = scanner.nextInt();
                    String nombre = null;
                    String rol = null;
                    String genero = null;
                    String nomconstelacion = null;
                    String rango = null;
                    int nvlper = 0;
                    Armas armas = null;
                    Elemento elemento1;
                    int opcionele1;
                    int edad = 0;
                    int opcion2;
                    if (opcionx == 1) {
                        perID += 1;
                        System.out.println("Nombre del personaje?");
                        nombre = scanner.next();
                        System.out.println("Edad del personaje?");
                        edad = scanner.nextInt();
                        System.out.println("Arma que lleva?");
                        System.out.println("1.Espada");
                        System.out.println("2.Arco");
                        System.out.println("3.Lanza");
                        System.out.println("4.Claymore");
                        System.out.println("5.Catalizador");
                        opcion2 = scanner.nextInt();
                        if (opcion2 == 1) {
                            System.out.println("Espada");
                            armas = Armas.espada;
                        } else if (opcion2 == 2) {
                            System.out.println("Arco");
                            armas = Armas.arco;
                        } else if (opcion2 == 3) {
                            System.out.println("Lanza");
                            armas = Armas.lanza;
                        } else if (opcion2 == 4) {
                            System.out.println("Claymore");
                            armas = Armas.claymore;
                        } else if (opcion2 == 5) {
                            System.out.println("Catalizador");
                            armas = Armas.catalizador;
                        }else{
                            System.out.println("Error de eleccion");
                        }
                        System.out.println("Que rol vas a ponerle?");
                        rol = scanner.next();
                        System.out.println("Genero Femenino o Masculino?");
                        genero = scanner.next();
                        System.out.println("Nombre de la constelacion del personaje?");
                        nomconstelacion = scanner.next();
                        System.out.println("Nota del personaje?");
                        rango = scanner.next();
                        System.out.println("Nivel del Personaje?");
                        nvlper = scanner.nextInt();
                        System.out.println("Elemento de la region?");
                        System.out.println("1.Pyro");
                        System.out.println("2.Hydro");
                        System.out.println("3.Electro");
                        System.out.println("4.Anemo");
                        System.out.println("5.Cryo");
                        System.out.println("6.Dendro");
                        System.out.println("7.Geo");
                        opcionele1 = scanner.nextInt();
                        if (opcionele1 == 1) {
                            System.out.println("Pyro");
                            elemento1 = Elemento.Pyro;
                        } else if (opcionele1 == 2) {
                            System.out.println("Hydro");
                            elemento1 = Elemento.Hydro;
                        } else if (opcionele1 == 3) {
                            System.out.println("Electro");
                            elemento1 = Elemento.Electro;
                        } else if (opcionele1 == 4) {
                            System.out.println("Anemo");
                            elemento1 = Elemento.Anemo;
                        } else if (opcionele1 == 5) {
                            System.out.println("Cryo");
                            elemento1 = Elemento.Cryo;
                        } else if (opcionele1 == 6) {
                            System.out.println("Dendro");
                            elemento1 = Elemento.Dendro;

                        } else if (opcionele1 == 7) {
                            System.out.println("Geo");
                            elemento1 = Elemento.Geo;

                        } else {
                            System.out.println("Error al elegir la opcion");
                            break;
                        }
                        mostrar += 1;
                        System.out.println(ID + " " + nombre + " " + edad + " " + armas + " " + rol + " " + genero + " " + nomconstelacion + " " + rango + " " + nvlper + " " + elemento1);
                    } else if (opcionx == 2) {
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
                        nambientacion = scanner.next();

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

                    } else {
                        System.out.println("Error al elegir la opcion");
                        break;
                    }
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    if(mostrar == 1){
                        System.out.println();

                    }else{
                        System.out.println("No hay nada listado");
                    }
                    break;
                default:
                    System.out.println("Error en la ejecucion");
            }
        }
        return menu();
    }

    public Region emplenarRegion() {
        Region region = new Region(1, nRegion.Mondstadt, "Alemania", Elemento.Anemo, new ArrayList<>());
        return region;
    }
}
