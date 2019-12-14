package com.example.pokemonselector2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Player1Winner extends AppCompatActivity {
    private Button playAgainButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player1_winner);

        playAgainButton1 = (Button) findViewById(R.id.playAgainButton1);
        playAgainButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restart();
            }

        });
    }
    public void restart() {
        Intent intent = new Intent(this,HomeScreen.class);
        startActivity(intent);

    }
}
