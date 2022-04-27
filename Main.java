package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Terminal terminal = new Terminal();
        Controlador controlador = new Controlador();
        Region region = new Region(1,nRegion.Mondstadt,"Alemania", Elemento.Anemo, new ArrayList<>());
        Controlador alta = new Controlador();

        terminal.emplenarRegion();
        controlador.toString();
        terminal.menu();
    }
}

