package com.example.genesiszul.k_learn;

import android.content.Intent;
import android.view.View;

import java.io.Serializable;

/**
 * Created by genesiszul on 09-05-17.
 */

public class Aprender implements Serializable {

    private String Nombre;
    private int Imagen;

    public Aprender(int img) {
        Imagen = img;
    }

    public Aprender(){
        Nombre="Verde";
    }

        public Aprender(String nombre, int imagen){
            Nombre = nombre;
            Imagen = imagen;
        }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }


}

