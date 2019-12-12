package com.example.pokemonselector2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button catchButton = (Button)findViewById(R.id.catchButton);
        catchButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openBattleArena();
            }
        });
    }

    String player1Selection = "";
    String player2Selection = "";

    public void displayToast (String message)
    {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void showBulbasaurClick (View view)
    {
        displayToast(getString(R.string.bulbasaur_select_message));
        Button player1ReadyButton = (Button) findViewById(R.id.player1ReadyButton);
        player1ReadyButton.setEnabled(true);
        player1Selection = "Bulbasaur";
        player2Selection = "Bulbasaur";

    }

    public void showCharmanderClick (View view)
    {
        displayToast(getString(R.string.charmander_select_message));
        Button player1ReadyButton = (Button) findViewById(R.id.player1ReadyButton);
        player1ReadyButton.setEnabled(true);
        player1Selection = "Charmander";
        player2Selection = "Charmander";
    }

    public void showPikachuClick (View view)
    {
        displayToast(getString(R.string.pikachu_select_message));
        Button player1ReadyButton = (Button) findViewById(R.id.player1ReadyButton);
        player1ReadyButton.setEnabled(true);
        player1Selection = "Pikachu";
        player2Selection = "Pikachu";
    }

    public void showSquirtleClick (View view)
    {
        displayToast(getString(R.string.squirtle_select_message));
        Button player1ReadyButton = (Button) findViewById(R.id.player1ReadyButton);
        player1ReadyButton.setEnabled(true);
        player1Selection = "Squirtle";
        player2Selection = "Squirtle";
    }

    public void openBattleArena ()
    {
        Intent intent = new Intent(this, Battle_Arena_GUI.class);
        startActivity(intent);
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

        if (player1Selection.equals("Bulbasaur")) {
            bulbasaurImage.setVisibility(View.INVISIBLE);
            bulbasaurImage.setEnabled(false);
            bulbImageName.setText(R.string.BulbNewNameBlue);
        }
        if (player1Selection.equals("Charmander")) {
            charmanderImage.setVisibility(View.INVISIBLE);
            charmanderImage.setEnabled(false);
            charImageName.setText(R.string.CharNewNameBlue);
        }
        if (player1Selection.equals("Pikachu")) {
            pikachuImage.setVisibility(View.INVISIBLE);
            pikachuImage.setEnabled(false);
            pikImageName.setText(R.string.PikNewNameBlue);
        }
        if (player1Selection.equals("Squirtle")) {
            squirtleImage.setVisibility(View.INVISIBLE);
            squirtleImage.setEnabled(false);
            squirtImageName.setText(R.string.SquirtNewNameBlue);
        }

        Button player2ReadyButton = (Button) findViewById(R.id.player2ReadyButton);
        player2ReadyButton.setEnabled(true);
        Button player1ReadyButton = (Button) findViewById(R.id.player1ReadyButton);
        player1ReadyButton.setVisibility(View.INVISIBLE);
        player2Selection.equals("");
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

        if (player2Selection.equals("Bulbasaur"))
        {
            bulbasaurImage.setVisibility(View.INVISIBLE);
            bulbasaurImage.setEnabled(false);
            charmanderImage.setEnabled(false);
            pikachuImage.setEnabled(false);
            squirtleImage.setEnabled(false);
            bulbImageName.setText(R.string.BulbNewNameRed);
        }
        if (player2Selection.equals("Charmander"))
        {
            charmanderImage.setVisibility(View.INVISIBLE);
            bulbasaurImage.setEnabled(false);
            charmanderImage.setEnabled(false);
            pikachuImage.setEnabled(false);
            squirtleImage.setEnabled(false);
            charImageName.setText(R.string.CharNewNameRed);
        }
        if (player2Selection.equals("Pikachu"))
        {
            pikachuImage.setVisibility(View.INVISIBLE);
            bulbasaurImage.setEnabled(false);
            charmanderImage.setEnabled(false);
            pikachuImage.setEnabled(false);
            squirtleImage.setEnabled(false);
            pikImageName.setText(R.string.PikNewNameRed);
        }
        if (player2Selection.equals("Squirtle"))
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
