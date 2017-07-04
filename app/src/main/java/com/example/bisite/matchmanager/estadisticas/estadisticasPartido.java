package com.example.bisite.matchmanager.estadisticas;

import java.util.ArrayList;
import com.example.bisite.matchmanager.acciones.cambio;
import com.example.bisite.matchmanager.acciones.gol;

/**
 * Created by BISITE on 04/07/2017.
 */

//objeto que representará los partidos
/*-------------------------------------------------------------*/
public class estadisticasPartido {
/*-------------------------------------------------------------*/

    private int tirosPuerta;
    private int tirosFuera;
    private int corners;
    private int fueraJuego;
    private int numGoles;


    private int tirosPuertaContra;
    private int tirosFueraContra;
    private int cornernsContra;
    private int numGolesContra;



    //definimos las listas de sucesos que ocurren en un partido
    ArrayList<estadisticasJugador> jugadores=new ArrayList<>();
    ArrayList<gol> goles= new ArrayList<>();
    ArrayList<gol> golesContra= new ArrayList<>();
    ArrayList<cambio> cambios= new ArrayList<>();
    ArrayList<cambio> cambiosContra= new ArrayList<>();
}
