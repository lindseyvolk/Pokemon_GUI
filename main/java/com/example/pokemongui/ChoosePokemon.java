package com.example.pokemongui;

// IMPORTS
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

// ACTIVITY
public class ChoosePokemon extends AppCompatActivity {
    int turn = 0;

    Pokemon Pikachu = new Pokemon("Pikachu", "Electric", 90, 18, 10, 25);
    Pokemon Bulbasaur = new Pokemon("Bulbasaur", "Grass", 110, 15, 13, 1);
    Pokemon Charmander = new Pokemon("Charmander", "Fire", 80, 20, 9, 4);
    Pokemon Squirtle = new Pokemon("Squirtle", "Water", 100, 17, 11, 7);

    Pokemon player1Selection;
    Pokemon player2Selection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_pokemon);

        // RECEIVE PLAYER INFORMATION FROM MAIN
        final Player player1 = (Player) getIntent().getExtras().getSerializable("player1");
        final Player player2 = (Player) getIntent().getExtras().getSerializable("player2");


        findViewById(R.id.catchButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                player1.roster.add(player1Selection);
                player2.roster.add(player2Selection);

                Intent intent = new Intent(getApplicationContext(), CatchPokemon.class);
                Bundle extras = new Bundle();

                extras.putSerializable("player1", player1);
                extras.putSerializable("player2", player2);

                intent.putExtras(extras);
                startActivity(intent);
            }

        });

    }

    public void displayToast (String message)
    {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void showBulbasaurClick (View view)
    {
        displayToast(getString(R.string.bulbasaur_select_message));
        Button player1ReadyButton = (Button) findViewById(R.id.player1ReadyButton);
        player1ReadyButton.setEnabled(true);
        if (turn%2 == 0) {
            player1Selection = Bulbasaur;
        } else {
            player2Selection = Bulbasaur;
        }
        turn++;

    }

    public void showCharmanderClick (View view)
    {
        displayToast(getString(R.string.charmander_select_message));
        Button player1ReadyButton = (Button) findViewById(R.id.player1ReadyButton);
        player1ReadyButton.setEnabled(true);
        if (turn%2 == 0) {
            player1Selection = Charmander;
        } else {
            player2Selection = Charmander;
        }
        turn++;

    }

    public void showPikachuClick (View view)
    {
        displayToast(getString(R.string.pikachu_select_message));
        Button player1ReadyButton = (Button) findViewById(R.id.player1ReadyButton);
        player1ReadyButton.setEnabled(true);
        if (turn%2 == 0) {
            player1Selection = Pikachu;
        } else {
            player2Selection = Pikachu;
        }
        turn++;

    }

    public void showSquirtleClick (View view)
    {
        displayToast(getString(R.string.squirtle_select_message));
        Button player1ReadyButton = (Button) findViewById(R.id.player1ReadyButton);
        player1ReadyButton.setEnabled(true);
        if (turn%2 == 0) {
            player1Selection = Squirtle;
        } else {
            player2Selection = Squirtle;
        }
        turn++;

    }


    public void showPlayer2Button (View view) {

        TextView bulbImageName = (TextView) findViewById(R.id.bulbImageName);
        TextView charImageName = (TextView) findViewById(R.id.charImageName);
        TextView pikImageName = (TextView) findViewById(R.id.pikImageName);
        TextView squirtImageName = (TextView) findViewById(R.id.squirtImageName);
        Button bulbasaurImage = (Button) findViewById(R.id.bulbasaurImage);
        Button charmanderImage = (Button) findViewById(R.id.charmanderImage);
        Button pikachuImage = (Button) findViewById(R.id.pikachuImage);
        Button squirtleImage = (Button) findViewById(R.id.squirtleImage);

        if (player1Selection.equals(Bulbasaur)) {
            bulbasaurImage.setVisibility(View.INVISIBLE);
            bulbasaurImage.setEnabled(false);
            bulbImageName.setText(R.string.BulbNewNameBlue);
        }
        if (player1Selection.equals(Charmander)) {
            charmanderImage.setVisibility(View.INVISIBLE);
            charmanderImage.setEnabled(false);
            charImageName.setText(R.string.CharNewNameBlue);
        }
        if (player1Selection.equals(Pikachu)) {
            pikachuImage.setVisibility(View.INVISIBLE);
            pikachuImage.setEnabled(false);
            pikImageName.setText(R.string.PikNewNameBlue);
        }
        if (player1Selection.equals(Squirtle)) {
            squirtleImage.setVisibility(View.INVISIBLE);
            squirtleImage.setEnabled(false);
            squirtImageName.setText(R.string.SquirtNewNameBlue);
        }

        Button player2ReadyButton = (Button) findViewById(R.id.player2ReadyButton);
        player2ReadyButton.setEnabled(true);
        Button player1ReadyButton = (Button) findViewById(R.id.player1ReadyButton);
        player1ReadyButton.setVisibility(View.INVISIBLE);
    }

    public void showCatchButton(View view)
    {
        TextView bulbImageName = (TextView)findViewById(R.id.bulbImageName);
        TextView charImageName = (TextView)findViewById(R.id.charImageName);
        TextView pikImageName = (TextView)findViewById(R.id.pikImageName);
        TextView squirtImageName = (TextView)findViewById(R.id.squirtImageName);
        Button bulbasaurImage = (Button)findViewById(R.id.bulbasaurImage);
        Button charmanderImage = (Button)findViewById(R.id.charmanderImage);
        Button pikachuImage = (Button)findViewById(R.id.pikachuImage);
        Button squirtleImage = (Button)findViewById(R.id.squirtleImage);

        if (player2Selection.equals(Bulbasaur))
        {
            bulbasaurImage.setVisibility(View.INVISIBLE);
            bulbasaurImage.setEnabled(false);
            charmanderImage.setEnabled(false);
            pikachuImage.setEnabled(false);
            squirtleImage.setEnabled(false);
            bulbImageName.setText(R.string.BulbNewNameRed);
        }
        if (player2Selection.equals(Charmander))
        {
            charmanderImage.setVisibility(View.INVISIBLE);
            bulbasaurImage.setEnabled(false);
            charmanderImage.setEnabled(false);
            pikachuImage.setEnabled(false);
            squirtleImage.setEnabled(false);
            charImageName.setText(R.string.CharNewNameRed);
        }
        if (player2Selection.equals(Pikachu))
        {
            pikachuImage.setVisibility(View.INVISIBLE);
            bulbasaurImage.setEnabled(false);
            charmanderImage.setEnabled(false);
            pikachuImage.setEnabled(false);
            squirtleImage.setEnabled(false);
            pikImageName.setText(R.string.PikNewNameRed);
        }
        if (player2Selection.equals(Squirtle))
        {
            squirtleImage.setVisibility(View.INVISIBLE);
            bulbasaurImage.setEnabled(false);
            charmanderImage.setEnabled(false);
            pikachuImage.setEnabled(false);
            squirtleImage.setEnabled(false);
            squirtImageName.setText(R.string.SquirtNewNameRed);
        }
        Button catchButton = (Button)findViewById(R.id.catchButton);
        catchButton.setEnabled(true);
        Button player2ReadyButton = (Button)findViewById(R.id.player2ReadyButton);
        player2ReadyButton.setVisibility(View.INVISIBLE);
    }
}
