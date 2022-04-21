package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        Controlador controlador = new Controlador();

        terminal.emplenarRegion();
        controlador.toString();
        terminal.menu();
    }
}
