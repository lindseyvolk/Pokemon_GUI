package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Catch extends AppCompatActivity {

    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private Button button17;
    private Button button18;
    private Button button19;
    private Button button20;
    private Button button21;

    Pokemon p1 = new Pokemon("Bulbasaur", "Grass", 110, 15, 13, 1);
    Pokemon p2 = new Pokemon("Charmander", "Fire", 80, 20, 9, 4);
    Pokemon p3 = new Pokemon("Squirtle", "Water", 100, 17, 11, 7);
    Pokemon p4 = new Pokemon("Pikachu", "Electric", 90, 18, 10, 25);
    Pokemon p5 = new Pokemon("Onix", "Rock", 120, 9, 15, 95);
    Pokemon p6 = new Pokemon("Dratini", "Dragon", 60, 25, 6, 147);
    Pokemon p7 = new Pokemon("Abra", "Psychic", 100, 14, 14, 63);
    Pokemon p8 = new Pokemon("Snorlax", "Normal", 160, 6, 20, 143);

    Pokemon p9 = new Pokemon("Bulbasaur", "Grass", 110, 15, 13, 1);
    Pokemon p10 = new Pokemon("Charmander", "Fire", 80, 20, 9, 4);
    Pokemon p11 = new Pokemon("Squirtle", "Water", 100, 17, 11, 7);
    Pokemon p12 = new Pokemon("Pikachu", "Electric", 90, 18, 10, 25);
    Pokemon p13 = new Pokemon("Onix", "Rock", 120, 9, 15, 95);
    Pokemon p14 = new Pokemon("Dratini", "Dragon", 60, 25, 6, 147);
    Pokemon p15 = new Pokemon("Abra", "Psychic", 100, 14, 14, 63);
    Pokemon p16 = new Pokemon("Snorlax", "Normal", 160, 6, 20, 143);

    // create object for player 1 and player 2
    // implement player
    // if (turn%2 == 0) -> player 1
    // else -> player 2

    Player player1 = new Player(1);
    Player player2 = new Player(2);

    Battle battle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
                // add p1 to roster
                if (battle.getTurn()%2 == 0)
                    player1.addToRoster(p1);
                else
                    player2.addToRoster(p1);
            }
        });

        button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
                // add p2 to roster for player 1 or player 2
                player1.addToRoster(p2);

            }
        });

        button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
                // no pokemon
            }
        });

        button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
                // add p3 to roster
                player1.addToRoster(p3);
            }
        });

        button14 = (Button) findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
                // no pokemon
            }
        });

        button15 = (Button) findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
                // add p4 to roster
                player1.addToRoster(p4);
            }
        });

        button16 = (Button) findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
                // add p5 to roster
                player1.addToRoster(p5);

            }
        });

        button17 = (Button) findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
                // add p6 to roster
                player1.addToRoster(p6);
            }
        });

        button18 = (Button) findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
                // add p7 to roster
                player1.addToRoster(p7);
            }
        });

        button19 = (Button) findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
                // no pokemon
            }
        });

        button20 = (Button) findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
                // add p8 to roster
                player1.addToRoster(p8);
            }
        });

        button21 = (Button) findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
                // no pokemon
            }
        });

    }

    public void openActivity2()
    {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void openActivity3()
    {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }
}
