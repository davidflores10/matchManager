package com.example.bisite.matchmanager;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.bisite.matchmanager.estadisticas.estadisticasJugador;

import java.util.ArrayList;

public class ventanaJugadores extends AppCompatActivity {


    private TextView nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_jugadores);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ArrayList<estadisticasJugador> listaJugadores =(ArrayList<estadisticasJugador>)getIntent().getSerializableExtra("listaJugadores");

        nombre=(TextView) findViewById(R.id.etiNombre);

        //Comprobamos si la lista está vacía
        if(!listaJugadores.isEmpty()) {
            listaJugadores.get(0).setNombre("david");
            nombre.setText(listaJugadores.get(0).getNombre());
        }

    }






}
