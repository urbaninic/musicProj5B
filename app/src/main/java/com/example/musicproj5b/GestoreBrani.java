package com.example.musicproj5b;

import java.util.ArrayList;

public class GestoreBrani {
    ArrayList<Brano> listaBrani;
    //necessario costruttore
    public GestoreBrani(){
        listaBrani = new ArrayList<Brano>();
    }
    public void addBrano() {
        Brano b = new Brano();
        listaBrani.add(b);
    }
    public void ListaBrani(){
        StringBuilder stBui = new StringBuilder();
        for(Brano brV : listaBrani)
        {
            stBui.append(brV.toString());
            stBui.append("\n"); // serve l'INVIO!!
        }
    }
}
//brano istanziano dall OnCick in gestore brani

//CONFRONTARE FOREACH PHP e RIGA 17