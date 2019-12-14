package com.example.pokemonselector2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        findViewById(R.id.playButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                Bundle extras = new Bundle();
                Player player1 = new Player(1);
                Player player2 = new Player(2);
                extras.putSerializable("player1", player1);
                extras.putSerializable("player2", player2);
                intent.putExtras(extras);
                startActivity(intent);
            }

        });
        /*
        Button playButton = (Button) findViewById(R.id.playButton);
        playButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openPokemonSelector();
            }
        });

         */

        Button aboutUsButton = (Button) findViewById(R.id.aboutUsButton);
        aboutUsButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openAboutUs();
            }
        });
    }

    public void openPokemonSelector ()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openAboutUs ()
    {
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
    }
}
