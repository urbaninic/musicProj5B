package com.example.musicproj5b;

import java.util.Date;

public class Brano {

    private String titolo;
    private String genere;
    private String autore;
    private String datapubblicazione; // settato a string


    // METODI GETTER:
    public String getTitolo() {
        return titolo;
    }
    public String getAutore() {
        return autore;
    }
    public String getDatapubblicazione() {
        return datapubblicazione;
    }
    public String getGenere() {
        return genere;
    }
    // FINE METODI GETTER
    //Costruttore
    public Brano (String tit, String gen, String aut, String datapub){
        // Convenzione -> data di pubblicazione -> String
        //definire costruttore -> brackets | 14.01.2022 -> fare costruttore
        //fare metodo to string in classe _> necessario per concatenare stringa. TUTTI GLI OGGETTI HANNO metodo toString()
            this.titolo = tit;
            this.genere = gen;
            this.autore = aut;
            this.datapubblicazione = datapub;
            //        android:entries="@array/generi"  da mettere su spinner
    }
}
