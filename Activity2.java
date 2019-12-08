package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    //private Button button;
    private Button button2;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_2);
        /*
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();
            }
        });
        */

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChoosePokemon2();
            }
        });
    }
    /*
    public void back() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    */

    public void openChoosePokemon2() {
        Intent intent = new Intent(this,ChoosePokemon2.class);
        startActivity(intent);

    }
}
