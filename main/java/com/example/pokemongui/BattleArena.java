package com.example.pokemongui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class BattleArena extends AppCompatActivity {
    private Button quitButton;
    private Button attackButton;
    private Button raiseButton;
    private Button defenseButton;

    //private TextView playerTurn;

    private ImageView player1Image;
    private ImageView player2Image;

    /*
    private TextView player1Text;
    private TextView player1Pokemon;
    private ImageView player1Image;
    private TextView player1Combat;
    private TextView player1Health;
    private TextView player1PokemonLeft;
    private TextView player1NumAlive;

    private TextView player2Text;
    private TextView player2Pokemon;
    private ImageView player2Image;
    private TextView player2Combat;
    private TextView player2Health;
    private TextView player2PokemonLeft;
    private TextView player2NumAlive;
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle_arena);

        final Player player1 = (Player) getIntent().getExtras().getSerializable("player1");
        final Player player2 = (Player) getIntent().getExtras().getSerializable("player2");


        final Battle pokemonBattle = new Battle(player1, player2);

        quitButton = (Button) findViewById(R.id.quitButton);
        quitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }


        });

        attackButton = (Button) findViewById(R.id.attackButton);
        attackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    pokemonBattle.Attack();
                }
                catch (IOException ex) {
                    pokemonBattle.Defense();
                }
            }
        });



        raiseButton = (Button) findViewById(R.id.raiseButton);
        raiseButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    pokemonBattle.Raise();
                }
        });

        defenseButton = (Button) findViewById(R.id.defenseButton);
        defenseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokemonBattle.Defense();
            }
        });


        TextView player1Health = findViewById(R.id.pokemon1Health);
        player1Health.setText(
                "HP: " + player1.getCurrentPokemon().health
        );

        TextView player2Health = findViewById(R.id.pokemon2Health);
        player2Health.setText(
                "HP: " + player2.getCurrentPokemon().health
        );

        TextView player1Pokemon = findViewById(R.id.player1Pokemon);
        player1Pokemon.setText(
                "Name: " + player1.getCurrentPokemon().name
        );

        TextView player2Pokemon = findViewById(R.id.player2Pokemon);
        player2Pokemon.setText(
                "Name: " + player2.getCurrentPokemon().name
        );

        TextView player1Combat = findViewById(R.id.pokemon1Combat);
        player1Combat.setText(
                "CP: " + player1.getCurrentPokemon().getAttack()
        );

        TextView player2Combat = findViewById(R.id.pokemon2Combat);
        player2Combat.setText(
                "CP: " + player2.getCurrentPokemon().getAttack()
        );

        TextView player1Text = findViewById(R.id.player1);

        player1Text.setText(
                "Player 1"
        );

        TextView player2Text = findViewById(R.id.player2);

        player2Text.setText(
                "Player 2"
        );





    }

    public void displayToast(String message)
    {
        Toast toast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT);
        View view = toast.getView();
        view.setBackgroundColor(Color.YELLOW);
        TextView text = (TextView) view.findViewById(android.R.id.message);
        text.setShadowLayer(0, 0, 0, Color.TRANSPARENT);
        text.setTextColor(Color.BLACK);
        text.setTextSize(18);
        toast.show();
    }

    public void showAttackClick(View view)
    {
        displayToast(getString(R.string.AttackName));

    }

    public void openMainActivity() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }



}


