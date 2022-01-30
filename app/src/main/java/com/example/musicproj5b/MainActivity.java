package com.example.musicproj5b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    // Attributi classe - dichiarazione
    Button btnInserisci;
    Button btnVisualizza;
    EditText txtTitolo;
    EditText txtAutore;
    GestoreBrani gb;
    Spinner spnGenere; //elemento dell'interfaccia utente che consente di selezionare rapidamente un valore da un set. È simile a un elenco a discesa.
    ArrayAdapter<String> arrayGeneri;
    String tag = "MainActivity"; // tag
    String[] generi = {"Pop", "Trap", "Rap", "Dance"};  // array generi
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d(tag, "onCreate");

        // PRIMA DICHIARAZIONE POI ISTANZA!
        // valori inizializzati quando c'è oncreate
        super.onCreate(savedInstanceState); // necessaria ad istantanea - passaggio app
        setContentView(R.layout.activity_main); // Parte grafica da mostrare
        gb = new GestoreBrani(); //istanza che prepara arraylist
        spnGenere = (Spinner)findViewById(R.id.spnGeneri);

        arrayGeneri = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, generi);
        // ha assunto i valori dell'adapter
        // Ultimo campo arrayadapter: source.
        // ora associarlo allo spinner
        spnGenere.setAdapter(arrayGeneri);
        txtTitolo = findViewById(R.id.txtTitolo); // (EditText) = casting
        txtAutore = findViewById(R.id.txtAutore);
        btnInserisci = findViewById(R.id.btnInserisci);
        btnVisualizza = findViewById(R.id.btnVisualiza);

        //btnVisualizza: cosa fa? bottone che visualizza nuova acvtivity (.java + xml) con playlist



        btnInserisci.setOnClickListener(new View.OnClickListener() {
            // Attribuire comportamento al click
            // Listener: ascoltatore
            @Override
            // Ridefinizione metodo
            public void onClick(View v) {

                //segue istanza addbrano
                String tit = txtTitolo.getText().toString();
                String aut = txtAutore.getText().toString();
                String gen = spnGenere.getSelectedItem().toString(); //restituisce elemento selezionato
                Brano b = new Brano(tit, aut, gen);
                Toast.makeText(getApplicationContext(), gen, Toast.LENGTH_LONG).show();
                gb.addBrano(b); //prende titolo, data pubblicazione.
                // cio lo aggiunge allarraylist. ORA AGGIUGNERE AL FILE


            }
        });


        btnVisualizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Sto avviando la seconda activity...", Toast.LENGTH_SHORT).show();
                // 1. ottenere la stringa con tutti i dati
                String lista = gb.listaBrani();
                // 2. istanziare un intent
                Intent intent = new Intent(getApplicationContext(), Act2.class);
                // 3. aggiungere la stringa al bundle
                intent.putExtra("listSongs", lista);
                // 4. avviare l'activity
                startActivity(intent);

                //  Log.d: Use this for debugging purposes.
                //  If you want to print out a bunch of messages so you can log the exact flow of your program, use this.
                //  If you want to keep a log of variable values, use this.

            }
        });

    }
}