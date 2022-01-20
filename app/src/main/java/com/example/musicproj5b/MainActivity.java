package com.example.musicproj5b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    Button btnInserisci;
    EditText txtTitolo;
    GestoreBrani gb;
    Spinner spnGenere;
    ArrayAdapter<String> aaG;

    String[] generi = {"Pop", "Trap", "Rap", "Dance"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // PRIMA DICHIARAZIONE POI ISTANZA!
        // valori inizializzati quando c'è oncreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gb = new GestoreBrani(); //istanza che prepara arraylist
        spnGenere = (Spinner)findViewById(R.id.spnGeneri);

        aaG = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, generi);
        // ha assunto i valori dell'adapter
        // Ultimo campo arrayadapter: source.
        // ora associarlo allo spinner
        spnGenere.setAdapter(aaG);
        txtTitolo = (EditText)findViewById(R.id.txtTitolo);
        btnInserisci = findViewById(R.id.btnInserisci);
        spnGenere=(Spinner)findViewById(R.id.spnGeneri);

        //btnVisualizza

        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String genselezionato = spnGenere.getSelectedItem().toString(); //metodo to string per prendere valore selezionato. RIGA PER CONOSCERE LA SELEZIONE DI USER
                Toast.makeText(getApplicationContext(), genselezionato, Toast.LENGTH_LONG).show();
                //segue istanza addbrano
                gb.addBrano(); //prende titolo, data pubblicazione.
                // cio lo aggiunge allarraylist. ORA AGGIUGNERE AL FILE


            }
        });
    }
}