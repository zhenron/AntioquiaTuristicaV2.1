package com.example.juliancamilomunoz.antioquiaturisticav21;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Xingke on 24/05/2015.
 */
public class Fragment1 extends ListFragment{

    private String[] opciones = {"Hoteles y Restaurantes","Bares","Sitios Turísticos",
            "Demografía","About"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.my_fragment1, container, false);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        //Toast.makeText(getActivity(),"Ha pulsado " +  opciones[position], Toast.LENGTH_SHORT).show();

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //noinspection SimplifiableIfStatement
        if(id == 0){
            Hoteles fragment = new Hoteles();
            fragmentTransaction.replace(android.R.id.content, fragment).commit();
        }
        else if(id == 1){
            Bares fragment = new Bares();
            fragmentTransaction.replace(android.R.id.content, fragment).commit();
        }
        else if(id == 2){
            Turismo fragment = new Turismo();
            fragmentTransaction.replace(android.R.id.content, fragment).commit();
        }
        else if(id == 3){
            Demografia fragment = new Demografia();
            fragmentTransaction.replace(android.R.id.content, fragment).commit();
        }
        else if(id == 4){
            About fragment = new About();
            fragmentTransaction.replace(android.R.id.content, fragment).commit();
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, opciones));
    }

}
