package com.example.bisite.matchmanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import com.example.bisite.matchmanager.estadisticas.estadisticasJugador;


public class MainActivity extends AppCompatActivity {


   //Array que tendrá contenidos a todos lo jugadores
   public ArrayList<estadisticasJugador> jugadores=new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();






                //Crear una nueva instancia de partidos para añadirlos
                startActivity(new Intent(MainActivity.this,partido.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    //Método para abrir la segunda ventana al pulsar el botón
    /*-------------------------------------------------------------*/
    public void iniciarSW(View view) {
    /*-------------------------------------------------------------*/


        startActivity(new Intent(MainActivity.this,partido.class));

    }

    /*-------------------------------------------------------------*/
    public void irVentanaJugadores(View view) {
    /*-------------------------------------------------------------*/

        Intent intVentJug=new Intent(MainActivity.this,ventanaJugadores.class);


        //añadimos un jugador de prueba para el paso de lista entre ventanas
        estadisticasJugador prueba=new estadisticasJugador();
        jugadores.add(prueba);
        //Le enviamos la lista de jugadores que tenemos actualmente
        intVentJug.putExtra("listaJugadores",jugadores);
        startActivity(intVentJug);





    }

}
