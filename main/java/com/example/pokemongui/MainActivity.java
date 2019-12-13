package com.example.pokemongui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// WELCOME PAGE: PLAY, ABOUT US, SETTINGS
// WE WILL DECLARE PLAYER1 AND PLAYER2 OBJECTS
// WE WILL SEND THE STATE OF THESE OBJECTS TO THE NEXT ACTIVITY

public class MainActivity extends AppCompatActivity {
    //private Button playButton;
    private Button aboutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.playButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CatchPokemon.class);
                Bundle extras = new Bundle();

                // CREATE PLAYER OBJECTS AND PASS THEIR STATE

                Player player1 = new Player(1);
                Player player2 = new Player(2);

                // ADD EXTRAS

                extras.putSerializable("player1", player1);
                extras.putSerializable("player2", player2);

                intent.putExtras(extras);

                startActivity(intent);
            }

        });

        aboutButton = (Button) findViewById(R.id.aboutButton);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutUs();
            }
        });


    }


    public void openAboutUs() {
        Intent intent = new Intent(this,AboutUs.class);
        startActivity(intent);

    }

}

