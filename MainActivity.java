package com.example.pokemonselector2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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
    }

    public void showCharmanderClick(View view)
    {
        displayToast(getString(R.string.charmander_select_message));
    }

    public void showPikachuClick(View view)
    {
        displayToast(getString(R.string.pikachu_select_message));
    }

    public void showSquirtleClick(View view)
    {
        displayToast(getString(R.string.squirtle_select_message));
    }
}
