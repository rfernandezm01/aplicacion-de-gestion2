package com.company;

import java.util.ArrayList;

enum Elemento{
    Pyro,
    Hydro,
    Electro,
    Anemo,
    Cryo,
    Dendro,
    Geo
}

public class Region {
    private int ID;
    private String nregion;
    private String ambientado;
    private Elemento elemento;
    private ArrayList<Personaje>personajes;

    public Region(int ID,String nregion, String ambientado, Elemento elemento, ArrayList<Personaje> personajes){
        this.ID = ID;
        this.nregion = nregion;
        this.ambientado = ambientado;
        this.elemento = elemento;
        this.personajes = new ArrayList<Personaje>();
    }
}
