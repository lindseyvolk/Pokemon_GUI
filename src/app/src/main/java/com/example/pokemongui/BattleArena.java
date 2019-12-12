package com.example.pokemongui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BattleArena extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle_arena);

        final Player player1 = (Player) getIntent().getExtras().getSerializable("player1");
        final Player player2 = (Player) getIntent().getExtras().getSerializable("player2");

        TextView textView = findViewById(R.id.textView);

        textView.setText(
                player1.player + "\n" + player2.player + "\n" +  player1.roster.get(0).health + "\n"
        );




    }
}
