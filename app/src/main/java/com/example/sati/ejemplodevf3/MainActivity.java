package com.example.sati.ejemplodevf3;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.StreamHandler;


public class MainActivity extends ActionBarActivity {

    public int a = 90;
    private double b = 0.9;
    private String c = "cadena";
    private boolean d = true;
    private char e = 'a';

    private int[][] a2 = {{1, 2, 3,}, {4, 5,6}};
    private String[] b2 = new String[3];

    private List<String> list1 = Arrays.asList("a","b","c","b");
    private List<String> lis2 = new ArrayList<>();

    private List<Integer> list3 = new ArrayList<>();
    private List<Float> list4 = new ArrayList<>();
    private List<Integer> list5 = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private void objetos () {
        Button button = new Button(this);
        button.setText("Boton");
        String cadena = "as";

        OtraClase otraClase= new OtraClase();
        otraClase.getA();




    }


    private void metodoif() {

        int a = 0;
        int b = 0;
        if (a == b) {
//            System.out.print("iguales");
            Log.d("TAG_APP", "Son iguales");
        } else {
            Log.d("TAG_APP", "No son iguales");
        }
    }

    private void metodoWhilte() {
        int a = 0;
        int b = 1;

        while (a == b) {
            Log.d("TAG_APP", "Se repite");
            a++;
        }

        do {
            Log.d("TAG_APP", "Se repite");
            a++;
        } while (a == b);

    }

    private void metodoSwitch() {
        int a = 0;
        switch (a) {
            case 0:
                Log.d("TAG_APP", "Es 0");
                break;
            case 1:
                Log.d("TAG_APP", "Es 1");
                break;
            case 2:
                Log.d("TAG_APP", "Es 2");
                break;
            case 3:
                Log.d("TAG_APP", "Es 3");
                break;
            case 4:
                Log.d("TAG_APP", "Es 4");
                break;
            default:
                Log.d("TAG_APP", "No se");
                break;
        }
    }

    private void imprimeLista(){
        for (int i = 0; i < list1.size(); i++) {
            Log.d("TAG_APP", "Valor: "+list1.get(i));

        }
    }

}
