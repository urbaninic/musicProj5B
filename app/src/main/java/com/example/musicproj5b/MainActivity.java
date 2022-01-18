package com.example.musicproj5b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Button btnInserisci;
    EditText txtTitolo;
    GestoreBrani gb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // PRIMA DICHIARO POI ISTANZIO!
        // valori inizializzati quando c'è oncreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gb = new GestoreBrani(); //istanza che prepara arraylist
        spnGenere = (Spinner)findViewById(R.id.spnGeneri);

        btnInserisci = findViewById(R.id.btnInserisci);


        txtTitolo = findViewById(R.id.txtRicerca);

        //btnVisualizza


        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gb.addBrano(); //prende titolo, data pubblicazione.
                // cio lo aggiunge allarraylist. ORA AGGIUGNERE AL FILE

            }
        });
    }
}