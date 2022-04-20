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
    public String toString(){

        return toString();
    }
}
