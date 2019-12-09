package com.example.pokemonselector2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void displayToast(String message)
    {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void showBulbasaurClick(View view)
    {
        displayToast(getString(R.string.bulbasaur_select_message));
        Button button = (Button)findViewById(R.id.button);
        button.setEnabled(true);
        button.setBackgroundColor(Color.GREEN);

    }

    public void showCharmanderClick(View view)
    {
        displayToast(getString(R.string.charmander_select_message));
        Button button = (Button)findViewById(R.id.button);
        button.setEnabled(true);
        button.setBackgroundColor(Color.GREEN);
    }

    public void showPikachuClick(View view)
    {
        displayToast(getString(R.string.pikachu_select_message));
        Button button = (Button)findViewById(R.id.button);
        button.setEnabled(true);
        button.setBackgroundColor(Color.GREEN);
    }

    public void showSquirtleClick(View view)
    {
        displayToast(getString(R.string.squirtle_select_message));
        Button button = (Button)findViewById(R.id.button);
        button.setEnabled(true);
        button.setBackgroundColor(Color.GREEN);
    }
}
