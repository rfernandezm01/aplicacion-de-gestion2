package com.company;

import java.util.ArrayList;

public class Controlador {
    private ArrayList<Region>region;
    private ArrayList<Personaje>personajes;

    public ArrayList<Personaje> getPersonajes() {
        for (int i = 0; i < personajes.size(); i++) {
            if(personajes.get(i).getregion()){

            }
        }
        return personajes;
    }
    public class alta{
        private int ID;
        private nRegion nregion;
        private String ambientado;
        private Elemento elemento;
        private ArrayList<Personaje>personajes;

        public int getid(){
            return ID;
        }
        public nRegion getnregion(){
            return nregion;
        }
        public String getAmbientado(){
            return ambientado;
        }
        public Elemento getElemento(){
            return elemento;
        }
        public void setid(int ID, nRegion nregion, String ambientado, Elemento elemento){
            this.ID = ID;
            this.nregion = nregion;
            this.ambientado = ambientado;
            this.elemento = elemento;
        }
    }
}
