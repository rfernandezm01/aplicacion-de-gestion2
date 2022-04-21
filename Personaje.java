package com.company;

enum Armas{
    espada,
    arco,
    catalizador,
    claymore,
    lanza
}
public class Personaje {
    private int perID;
    private String nombre;
    private int edad;
    private Armas armas;
    private String rol;
    private String genero;
    private String nomconstelacion;
    private String rango;
    private int nvlper;
    private Elemento elemento;

    private boolean region;

    public Personaje(int perID, String nombre, int edad, Armas armas, String rol, String genero, String nomconstelacion, String rango, int nvlper, Elemento elemento){
        this.perID = perID;
        this.nombre = nombre;
        this.edad = edad;
        this.armas = armas;
        this.rol = rol;
        this.genero = genero;
        this.nomconstelacion = nomconstelacion;
        this.rango = rango;
        this.nvlper = nvlper;
        this.elemento = elemento;
    }

    public Armas comprobararmas(){
        if(this.armas == Armas.arco || this.armas == Armas.espada || this.armas == Armas.lanza || this.armas == Armas.claymore || this.armas == Armas.catalizador){
            this.armas = this.armas;
        }else{
            this.armas = Armas.espada;
        }
        return comprobararmas();
    }
    public Armas getArmas(){
        return armas;
    }
    public boolean getregion(){
        return region;
    }
    public String toString(){

        return toString();
    }
}
