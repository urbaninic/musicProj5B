package com.example.musicproj5b;

import java.util.ArrayList;

public class GestoreBrani {
    ArrayList<Brano> listaBrani;
    //necessario costruttore
    public GestoreBrani(){
        listaBrani = new ArrayList<Brano>();
    }

    public void addBrano(Brano b) {
        listaBrani.add(b);
    }

    public String listaBrani(){
        //  istanza di StringBuilder
        StringBuilder sb = new StringBuilder();
        // stessa cosa di foreach JAVA!
        for(Brano brV : listaBrani)
        {
            sb.append(brV.toString());
            sb.append("\n"); // serve l'INVIO!!
        }
        return sb.toString();
    }
}
//brano istanziano dall OnCick in gestore brani

//CONFRONTARE FOREACH PHP e RIGA 17

