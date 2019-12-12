package com.example.pokemongui;

// IMPORTS
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// ACTIVITY
public class ChoosePokemon extends AppCompatActivity {
    int turn = 0;
    private Button pokemonButton;
    private Button battleButton;
    Pokemon Pikachu = new Pokemon("Pikachu", "Electric", 90, 18, 10, 25);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_pokemon);

        // RECEIVE PLAYER INFORMATION FROM MAIN
        final Player player1 = (Player) getIntent().getExtras().getSerializable("player1");
        final Player player2 = (Player) getIntent().getExtras().getSerializable("player2");

        TextView textView = findViewById(R.id.textView);

        textView.setText(
                player1.player + "\n" + player2.player + "\n"
        );

        pokemonButton = (Button) findViewById(R.id.pokemonButton);
        pokemonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (turn%2 == 0) {
                    player1.roster.add(0,Pikachu);
                } else {
                    player2.roster.add(0,Pikachu);
                }
                turn++;
                //openAboutUs();
            }
        });

        findViewById(R.id.battleButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CatchPokemon.class);
                Bundle extras = new Bundle();

                // CREATE PLAYER OBJECTS AND PASS THEIR STATE

                // Player player1 = new Player(1);
                // Player player2 = new Player(2);

                // ADD EXTRAS

                extras.putSerializable("player1", player1);
                extras.putSerializable("player2", player2);
                // MAY NOT NEED TO SEND PIKACHU OBJECT
                //extras.putSerializable("pikachu", Pikachu);

                intent.putExtras(extras);

                startActivity(intent);
            }

        });

    }

    public void openAboutUs() {
        Intent intent = new Intent(this,AboutUs.class);
        startActivity(intent);

    }
}
