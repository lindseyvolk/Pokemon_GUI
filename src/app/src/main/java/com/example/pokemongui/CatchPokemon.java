package com.example.pokemongui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CatchPokemon extends AppCompatActivity {
    int turn = 0;
    private Button pokemon1Button;
    private Button pokemon2Button;
    private Pokemon Bulbasaur = new Pokemon("Bulbasaur", "Grass", 110, 15, 13, 1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catch_pokemon);

        // RECEIVE PLAYER INFORMATION FROM MAIN
        final Player player1 = (Player) getIntent().getExtras().getSerializable("player1");
        final Player player2 = (Player) getIntent().getExtras().getSerializable("player2");

        TextView textView = findViewById(R.id.textView);
        textView.setText(
                player1.player + "\n" + player2.player + "\n" + player1.roster.get(0).getName() + "\n"
        );

        pokemon1Button = (Button) findViewById(R.id.pokemon1Button);
        pokemon1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (turn%2 == 0) {
                   player1.addToRoster(Bulbasaur);
                   player1.roster.get(0).health -= 10.0;
               } else {
                   player2.addToRoster(Bulbasaur);
                   player1.roster.get(0).health -= 10.0;
               }
               turn++;
               if (player1.roster.size() == 4 || player2.roster.size() == 4) {

                   //  INSERT POP UP
                   Intent intent = new Intent(getApplicationContext(), BattleArena.class);
                   Bundle extras = new Bundle();

                   extras.putSerializable("player1", player1);
                   extras.putSerializable("player2", player2);
                   intent.putExtras(extras);
                   startActivity(intent);
               }

            }
        });

        // START BATTLE BUTTON
        pokemon2Button = (Button) findViewById(R.id.pokemon2Button);
        pokemon2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //openBattleArena();


                Intent intent = new Intent(getApplicationContext(), BattleArena.class);
                Bundle extras = new Bundle();

                extras.putSerializable("player1", player1);
                extras.putSerializable("player2", player2);
                intent.putExtras(extras);
                startActivity(intent);



            }
        });



    }


}
