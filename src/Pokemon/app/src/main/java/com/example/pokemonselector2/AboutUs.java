package com.example.pokemonselector2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        Button backHomeButton = (Button) findViewById(R.id.backHomeButton);
        backHomeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                returnHome();
            }
        });
    }

    public void returnHome ()
    {
        Intent intent = new Intent(this, HomeScreen.class);
        startActivity(intent);
    }
}
