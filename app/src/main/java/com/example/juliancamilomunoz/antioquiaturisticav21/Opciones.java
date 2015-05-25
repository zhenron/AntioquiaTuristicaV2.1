package com.example.juliancamilomunoz.antioquiaturisticav21;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Opciones extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
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

    public void AbrirBrazil(View view){

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Brazil fragment = new Brazil();
        fragmentTransaction.replace(android.R.id.content, fragment).commit();
    }

    public void AbrirBurros(View view){

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Burros fragment = new Burros();
        fragmentTransaction.replace(android.R.id.content, fragment).commit();

    }

    public void AbrirHandM(View view){

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        HandM fragment = new HandM();
        fragmentTransaction.replace(android.R.id.content, fragment).commit();

    }

    public void AbrirSala94(View view){

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Sala94 fragment = new Sala94();
        fragmentTransaction.replace(android.R.id.content, fragment).commit();
    }

    public void AbrirJano(View view){

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Jano fragment = new Jano();
        fragmentTransaction.replace(android.R.id.content, fragment).commit();
    }

    public void AbrirPizza(View view){

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Pizza fragment = new Pizza();
        fragmentTransaction.replace(android.R.id.content, fragment).commit();
    }

    public void AbrirCruz(View view){

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Cruz fragment = new Cruz();
        fragmentTransaction.replace(android.R.id.content, fragment).commit();
    }

    public void AbrirAsuncion(View view){

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Asuncion fragment = new Asuncion();
        fragmentTransaction.replace(android.R.id.content, fragment).commit();
    }

    public void AbrirSanJuan(View view){

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        SanJuan fragment = new SanJuan();
        fragmentTransaction.replace(android.R.id.content, fragment).commit();
    }

    public void AbrirComfama(View view){

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Comfama fragment = new Comfama();
        fragmentTransaction.replace(android.R.id.content, fragment).commit();
    }

    public void AbrirCristoRey(View view){

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        CristoRey fragment = new CristoRey();
        fragmentTransaction.replace(android.R.id.content, fragment).commit();
    }
}
