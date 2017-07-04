package com.example.bisite.matchmanager.estadisticas;

/**
 * Created by BISITE on 04/07/2017.
 */

//objeto para representar un jugador
/*-------------------------------------------------------------*/
public class estadisticasJugador {
/*-------------------------------------------------------------*/


    private String nombre;
    private int edad;
    private int dorsal;
    private float estatura;
    private String posicion;
    private int numGoles;
    private int numTirosPuerta;
    private int numTirosfuera;


    public int getNumGoles() {
        return numGoles;
    }

    public void setNumGoles(int numGoles) {
        this.numGoles = numGoles;
    }

    public int getNumTirosPuerta() {
        return numTirosPuerta;
    }

    public void setNumTirosPuerta(int numTirosPuerta) {
        this.numTirosPuerta = numTirosPuerta;
    }

    public int getNumTirosfuera() {
        return numTirosfuera;
    }

    public void setNumTirosfuera(int numTirosfuera) {
        this.numTirosfuera = numTirosfuera;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

}
