package com.example.musicproj5b;

import java.util.Date;

public class Brano {

    private String titolo;
    private String genere;
    private String autore;
    private String datapubblicazione; //provvisioramente setttato a string


    // INIZIO METODI GETTER
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
    public Brano ()//definire costruttore -> brackets | 14.01.2022 -> fare costruttore
    {

    }
}
