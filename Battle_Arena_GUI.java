package com.example.pokemonselector2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class Battle_Arena_GUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle__arena__gui);
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
