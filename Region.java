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

enum nRegion{
    Mondstadt,
    Liyue,
    Inazuma,
    Snezhnaya,
    Sumeru,
    Fontaine,
    Natlan,
    Khaenriah
}

public class Region {
    private int ID;
    private nRegion nregion;
    private String ambientado;
    private Elemento elemento;
    private ArrayList<Personaje>personajes;

    public Region(int ID,nRegion nregion, String ambientado, Elemento elemento, ArrayList<Personaje> personajes){
        this.ID = ID;
        this.nregion = nregion;
        this.ambientado = ambientado;
        this.elemento = elemento;
        this.personajes = new ArrayList<Personaje>();
    }

    public Elemento comprobarelemento(){
        if(this.elemento == Elemento.Pyro || this.elemento == Elemento.Hydro || this.elemento == Elemento.Electro || this.elemento == Elemento.Anemo || this.elemento == Elemento.Cryo || this.elemento == Elemento.Dendro || this.elemento == Elemento.Geo){
            this.elemento = this.elemento;
        }else{
            this.elemento = Elemento.Pyro;
        }
        return comprobarelemento();
    }
    public String comprobarnRegion(){
        if(this.nregion == nRegion.Mondstadt || this.nregion == nRegion.Liyue || this.nregion == nRegion.Inazuma || this.nregion == nRegion.Sumeru || this.nregion == nRegion.Fontaine || this.nregion == nRegion.Natlan || this.nregion == nRegion.Snezhnaya || this.nregion == nRegion.Khaenriah){
            this.nregion = this.nregion;
        }else{
            this.nregion = nRegion.Mondstadt;
        }
        return comprobarnRegion();
    }

    public nRegion getNregion() {
        return nregion;
    }
    public Elemento getElemento(){
        return elemento;
    }

    public String toString(){

        return toString();
    }
}
