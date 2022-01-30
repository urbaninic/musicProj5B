package com.example.musicproj5b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

// predne intent passato da act 1 + extra, recuperare la stringa e metterlo dentro l'extra

public class Act2 extends AppCompatActivity {
    //Dichiarare gli atttributi dei conttroli grafici
    TextView titolo;
    TextView listaBrani;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);

        // recuperare i riferimenti
        listaBrani = findViewById(R.id.txtView2);
        titolo = findViewById(R.id.txtTitolo1);
        // recuperare l'intent
        Intent intent = getIntent();

        // recuperare l'extra
        String lista = intent.getStringExtra("listaBrani");

        // visualizzare la stringa

        listaBrani.setText(lista);

    }
}