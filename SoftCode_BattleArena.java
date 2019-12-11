package com.example.ec327_final;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Battle_Arena_GUI extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;


    /*
        current_p1_pokemon=Get current player (iterates)
        name1=current_p1_pokemon.getName();
        need to do this for the current pokemon, should remove them if dead in pokemon
        shows the name in the name1 slot
        hp1=current_p1_pokemon.getHealth();
        cp1=current_p1_pokemon.getAttack();
        defense1=current_p1_pokemon.getDefense();
        img1= name1.jpg???

        player2
        current_p2_pokemon= Get current player
        name2=current_p2_pokemon.getName();
        need to do this for the current pokemon, should remove if dead in pokemon
        hp2=current_p2_pokemon.getHealth();
        cp2=current_p2_pokemon.getAttack();
        defense2=current_p2_pokemon.getDefense();
        img2=name2.jpg (can just add if statements)



     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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



}
