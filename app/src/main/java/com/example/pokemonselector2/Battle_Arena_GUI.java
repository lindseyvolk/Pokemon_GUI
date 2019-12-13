package com.example.pokemonselector2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class Battle_Arena_GUI extends AppCompatActivity {

    private Button quitButton;
    private Button attackButton;
    private Button raiseButton;
    private Button defenseButton;


    private ImageView player1Image;
    private ImageView player2Image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle__arena__gui);

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


                showAttackClick(v);
                pokemonBattle.Attack();
                int winner = pokemonBattle.Winner();
                if (winner == 1)
                    openPlayer1WinActivity();
                else if (winner == 2)
                    openPlayer2WinActivity();
                /*if (player1.roster.get(0).health <= 0)
                    openPlayer2WinActivity();
                else if (player2.roster.get(0).health <= 0)
                    openPlayer1WinActivity();
                else {

                 */
                else {
                    TextView player1Health = findViewById(R.id.pokemon1Health);
                    player1Health.setText(
                            "HP: " + player1.getCurrentPokemon().health
                    );
                    TextView player2Health = findViewById(R.id.pokemon2Health);
                    player2Health.setText(
                            "HP: " + player2.getCurrentPokemon().health
                    );
                    TextView playerTurn = findViewById(R.id.playerTurn);
                    if (pokemonBattle.getTurn() == 1) {
                        playerTurn.setText(
                                "Player 1's Turn"
                        );
                    } else {
                        playerTurn.setText(
                                "Player 2's Turn"
                        );
                    }


                    TextView player1NumAlive = findViewById(R.id.player1NumAlive);
                    player1NumAlive.setText(String.valueOf(player1.getNumberAlive()));


                    TextView player2NumAlive = findViewById(R.id.player2NumAlive);
                    player2NumAlive.setText(String.valueOf(player2.getNumberAlive()));



                }

                ImageView player1Image = findViewById(R.id.player1Image);
                if (player1.roster.get(player1.iterator).health <= 0) {
                    if (player1.roster.get(player1.iterator).name.equals("Bulbasaur"))
                        player1Image.setImageResource(R.drawable.bulbasaur);
                    if (player1.roster.get(player1.iterator).name.equals("Charmander"))
                        player1Image.setImageResource(R.drawable.charmander);
                    if (player1.roster.get(player1.iterator).name.equals("Pikachu"))
                        player1Image.setImageResource(R.drawable.pikachu);
                    if (player1.roster.get(player1.iterator).name.equals("Squirtle"))
                        player1Image.setImageResource(R.drawable.squirtle);
                }

                ImageView player2Image = findViewById(R.id.player2Image);
                if (player2.roster.get(player2.iterator).health <= 0) {
                    if (player2.roster.get(player2.iterator).name.equals("Bulbasaur"))
                        player2Image.setImageResource(R.drawable.bulbasaur);
                    if (player2.roster.get(player2.iterator).name.equals("Charmander"))
                        player2Image.setImageResource(R.drawable.charmander);
                    if (player2.roster.get(player2.iterator).name.equals("Pikachu"))
                        player2Image.setImageResource(R.drawable.pikachu);
                    if (player2.roster.get(player2.iterator).name.equals("Squirtle"))
                        player2Image.setImageResource(R.drawable.squirtle);
                }

            }


        });




        raiseButton = (Button) findViewById(R.id.raiseButton);
        raiseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokemonBattle.Raise();
                TextView player1Combat = findViewById(R.id.pokemon1Combat);
                player1Combat.setText(
                        "CP: " + player1.getCurrentPokemon().attack
                );

                TextView player2Combat = findViewById(R.id.player2Combat);
                player2Combat.setText(
                        "CP: " + player2.getCurrentPokemon().attack
                );
                TextView playerTurn = findViewById(R.id.playerTurn);
                if (pokemonBattle.getTurn() == 1) {
                    playerTurn.setText(
                            "Player 1's Turn"
                    );
                } else {
                    playerTurn.setText(
                            "Player 2's Turn"
                    );
                }
            }
        });

        defenseButton = (Button) findViewById(R.id.defenseButton);
        defenseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokemonBattle.Defense();
                TextView playerTurn = findViewById(R.id.playerTurn);
                if (pokemonBattle.getTurn() == 1) {
                    playerTurn.setText(
                            "Player 1's Turn"
                    );
                } else {
                    playerTurn.setText(
                            "Player 2's Turn"
                    );
                }
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
                player1.getCurrentPokemon().name
        );

        TextView player2Pokemon = findViewById(R.id.player2Pokemon);
        player2Pokemon.setText(
                player2.getCurrentPokemon().name
        );

        TextView player1Combat = findViewById(R.id.pokemon1Combat);
        player1Combat.setText(
                "CP: " + player1.getCurrentPokemon().getAttack()
        );

        TextView player2Combat = findViewById(R.id.player2Combat);
        player2Combat.setText(
                "CP: " + player2.getCurrentPokemon().getAttack()
        );


        TextView playerTurn = findViewById(R.id.playerTurn);
        if (pokemonBattle.getTurn() == 1) {
            playerTurn.setText(
                    "Player 1's Turn"
            );
        } else {
            playerTurn.setText(
                    "Player 2's Turn"
            );
        }
/*
        ImageView player1Image = findViewById(R.id.player1Image);
        if (player1.roster.get(getIterator()).equals("Bulbasaur"))
            player1Image.setImageResource(R.drawable.bulbasaur);
        if (player1.getCurrentPokemon().name.equals("Charmander"))
            player1Image.setImageResource(R.drawable.charmander);
        if (player1.getCurrentPokemon().name.equals("Pikachu"))
            player1Image.setImageResource(R.drawable.pikachu);
        if (player1.getCurrentPokemon().name.equals("Squirtle"))
            player1Image.setImageResource(R.drawable.squirtle);

        ImageView player2Image = findViewById(R.id.player2Image);
        if (player2.getCurrentPokemon().name.equals("Bulbasaur"))
            player2Image.setImageResource(R.drawable.bulbasaur);
        if (player2.getCurrentPokemon().name.equals("Charmander"))
            player2Image.setImageResource(R.drawable.charmander);
        if (player2.getCurrentPokemon().name.equals("Pikachu"))
            player2Image.setImageResource(R.drawable.pikachu);
        if (player2.getCurrentPokemon().name.equals("Squirtle"))
            player2Image.setImageResource(R.drawable.squirtle);

 */
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
        Intent intent = new Intent(this,HomeScreen.class);
        startActivity(intent);

    }

    public void openPlayer1WinActivity() {
        Intent intent = new Intent(this,Player1Winner.class);
        startActivity(intent);

    }



    public void openPlayer2WinActivity() {
        Intent intent = new Intent(this,Player2Winner.class);
        startActivity(intent);

    }
}
