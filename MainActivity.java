package com.example.catch_pokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private CatchPokemonGrass firstgrass = new CatchPokemonGrass(1, false);

    private int buttonState = 1;


    private ImageButton button1;
    private ImageButton button2;
    private ImageButton button3;
    private ImageButton button4;
    private ImageButton button5;
    private ImageButton button6;
    private Button finish;
    //private ImageButton button16;
    private int b1_click = 0;
    private int b2_click = 0;
    private int b3_click = 0;
    private int b4_click = 0;
    private int b5_click = 0;
    private int b6_click = 0;

    private int finish_game = 0;


    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    // Random rand = new Random();
    // int rand_int1 = rand.nextInt(7);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button2 = (ImageButton) findViewById(R.id.button2);
        //public void displayToast(View v)

        //String message = "No Pokemon here...try again";


        button1 = (ImageButton) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (b1_click == 0) {
                    //finish_game++;
                    openActivity1();
                } else displayToast(getString(R.string.no_pokemon_message));
                b1_click++;
            }
        });


        button2 = (ImageButton) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (b2_click == 0) {
                    openActivity2();
                } else displayToast(getString(R.string.no_pokemon_message));
                b2_click++;

            }
        });


        button3 = (ImageButton) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (b3_click == 0) {
                    //finish_game++;
                    openActivity3();
                } else displayToast(getString(R.string.no_pokemon_message));
                b3_click++;
                //button3.setVisibility(View.INVISIBLE);
                //openActivity3();
            }
        });


        button4 = (ImageButton) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (b4_click == 0) {
                    //finish_game++;
                    openActivity4();
                } else displayToast(getString(R.string.no_pokemon_message));
                b4_click++;
            }
        });

        button5 = (ImageButton) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (b5_click == 0) {
                    //finish_game++;
                    openActivity5();
                } else displayToast(getString(R.string.no_pokemon_message));
                b5_click++;
            }
        });

        button6 = (ImageButton) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textView8 = (TextView) findViewById(R.id.textView8);
                if (b6_click == 0) {
                    //finish_game++;
                    openActivity6();
                } else displayToast(getString(R.string.no_pokemon_message));
                b6_click++;
            }
        });

        if (finish_game != 0) {
            finish.setEnabled(true);
        }

        finish = (Button) findViewById(R.id.finish);
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //do something
            }
        });

    }


    public void openActivity1() {
        Intent i = new Intent(getApplicationContext(), Activity1.class);
        startActivity(i);
        finish_game++;
    }


    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
        finish_game++;

    }

    public void openActivity3() {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
        finish_game++;
    }

    public void openActivity4() {
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
        finish_game++;
    }

    public void openActivity5() {
        Intent intent = new Intent(this, Activity5.class);
        startActivity(intent);
        finish_game++;
    }

    public void openActivity6() {
        Intent intent = new Intent(this, Activity6.class);
        startActivity(intent);
        finish_game++;
    }
}