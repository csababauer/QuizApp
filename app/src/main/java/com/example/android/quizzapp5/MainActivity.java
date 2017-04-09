package com.example.android.quizzapp5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public int amScore;
    public int afScore;
    public int euScore;
    public int number;
    public int intEu;
    public int intAm;
    public int intAf;
    public int scoreEu;
    public int scoreAm;
    public int scoreAf;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //receive the score intents for Europe
        Intent i = getIntent();
        int number = i.getIntExtra("intEu",0);
         //show score for Europe
       //TextView EuroScore = (TextView) findViewById(R.id.mainScoreEu);
       //EuroScore.setText("" + number);

        //receive score for America
        Intent intAm = getIntent();
        int numberAm = intAm.getIntExtra("intAm",0);
        //show score for America
        //TextView amScore = (TextView) findViewById(mainScoreAme);
        //amScore.setText("" + numberAm);

        //receive score for Africa
        Intent intAf = getIntent();
        int numberAf = intAf.getIntExtra("intAf",0);
        //show score for America
        //TextView afScore = (TextView) findViewById(R.id.mainScoreAfrica);
        //afScore.setText("" + numberAf);

    }



    //save data if you change orientation
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        // Save UI state changes to the savedInstanceState.
        // This bundle will be passed to onCreate if the process is
        // killed and restarted.

        savedInstanceState.putInt("amScoreS", amScore);
        savedInstanceState.putInt("euScoreS", euScore);
        savedInstanceState.putInt("afScoreS", afScore);
    }
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // Restore UI state from the savedInstanceState.
        // This bundle has also been passed to onCreate.

        int amScore = savedInstanceState.getInt("amScoreS");
        int euScore = savedInstanceState.getInt("euScoreS");
        int afScore = savedInstanceState.getInt("afScoreS");


    }



    //opens new page on click
    public void openAfricaPage (View view) {
            Intent i = new Intent(this, AfricaActivity.class);
            startActivity(i);
         }
    //opens new page onclick
    public void openAmericaPage (View view) {
        Intent i = new Intent(this, AmericaActivity.class);
        startActivity(i);
    }

    //opens new page onclick
    public void openEuropePage (View view) {
        Intent i = new Intent(this, EuropeActivity.class);
        startActivity(i);
    }




}
