package com.example.catch_pokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Handler;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

  private CatchPokemonGrass firstgrass = new CatchPokemonGrass(1, false);

  private int buttonState = 1;


  //private ImageButton button16;
  private int b1_click = 0;
  private int b2_click = 0;
  private int b3_click = 0;
  private int b4_click = 0;
  private int b5_click = 0;
  private int b6_click = 0;

  private int finish_game = 0;

  int turn = 0;
  int turn_text = 0;

  Player player1 = new Player(1);
  Player player2 = new Player(2);

  Pokemon Onix = new Pokemon("Onix", "Rock", 120, 9, 15, 95);
  Pokemon Dratini = new Pokemon("Dratini", "Dragon", 60, 25, 6, 147);
  Pokemon Abra = new Pokemon("Abra", "Psychic", 100, 14, 14, 63);
  Pokemon Snorlax = new Pokemon("Snorlax", "Normal", 160, 6, 20, 143);
  Pokemon Eevee = new Pokemon("Eevee", "Normal", 80, 8,12,133);
  Pokemon Mudkip = new Pokemon("Mudkip", "Normal", 80, 10, 14, 258);

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


    ImageButton button1 = (ImageButton) findViewById(R.id.button1);
    button1.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        if (b1_click == 0) {
          finish_game++;
          turn++;
          openActivity1();
          if (turn % 2 == 0)
            player1.addToRoster(Mudkip);
          else
            player2.addToRoster(Mudkip);
        } else displayToast(getString(R.string.no_pokemon_message));
        b1_click++;
        turn_text++;
        if (finish_game == 6) {
          Button finish = (Button) findViewById(R.id.finish);
          finish.setEnabled(true);
          finish.setVisibility(View.VISIBLE);
          openBattleArena();
        }
        if (turn_text % 2 == 0) {
          TextView player1_text = (TextView) findViewById(R.id.player1_text);
          TextView player2_text = (TextView) findViewById(R.id.player2_text);
          player1_text.setVisibility(View.VISIBLE);
          player2_text.setVisibility(View.INVISIBLE);
          }
        else{
          TextView player1_text = (TextView) findViewById(R.id.player1_text);
          TextView player2_text = (TextView) findViewById(R.id.player2_text);
          player2_text.setVisibility(View.VISIBLE);
          player1_text.setVisibility(View.INVISIBLE);
        }
      }

    });


    ImageButton button2 = (ImageButton) findViewById(R.id.button2);
    button2.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        if (b2_click == 0) {
          finish_game++;
          turn++;
          openActivity2();
          if (turn % 2 == 0) {
            player1.addToRoster(Abra);
          }
          else {
            player2.addToRoster(Abra);
          }

        } else displayToast(getString(R.string.no_pokemon_message));
        b2_click++;
        turn_text++;
        if (finish_game == 6) {
          Button finish = (Button) findViewById(R.id.finish);
          finish.setEnabled(true);
          finish.setVisibility(View.VISIBLE);
          openBattleArena();
        }
        if (turn_text % 2 == 0) {
          TextView player1_text = (TextView) findViewById(R.id.player1_text);
          TextView player2_text = (TextView) findViewById(R.id.player2_text);
          player1_text.setVisibility(View.VISIBLE);
          player2_text.setVisibility(View.INVISIBLE);
        } else {
          TextView player1_text = (TextView) findViewById(R.id.player1_text);
          TextView player2_text = (TextView) findViewById(R.id.player2_text);
          player2_text.setVisibility(View.VISIBLE);
          player1_text.setVisibility(View.INVISIBLE);
        }
      }
    });


    ImageButton button3 = (ImageButton) findViewById(R.id.button3);
    button3.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        if (b3_click == 0) {
          finish_game++;
          turn++;
          openActivity3();
          if (turn % 2 == 0) {
            player1.addToRoster(Eevee);
          }
          else {
            player2.addToRoster(Eevee);
          }

        } else displayToast(getString(R.string.no_pokemon_message));
        b3_click++;
        turn_text++;
        if (finish_game == 6) {
          Button finish = (Button) findViewById(R.id.finish);
          finish.setEnabled(true);
          finish.setVisibility(View.VISIBLE);
          openBattleArena();
        }
        if (turn_text % 2 == 0) {
          TextView player1_text = (TextView) findViewById(R.id.player1_text);
          TextView player2_text = (TextView) findViewById(R.id.player2_text);
          player1_text.setVisibility(View.VISIBLE);
          player2_text.setVisibility(View.INVISIBLE);
        } else {
          TextView player1_text = (TextView) findViewById(R.id.player1_text);
          TextView player2_text = (TextView) findViewById(R.id.player2_text);
          player2_text.setVisibility(View.VISIBLE);
          player1_text.setVisibility(View.INVISIBLE);
        }
      }
    });


    ImageButton button4 = (ImageButton) findViewById(R.id.button4);
    button4.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        if (b4_click == 0) {
          finish_game++;
          turn++;
          openActivity4();
          if (turn % 2 == 0) {
            player1.addToRoster(Snorlax);
          }
          else {
            player2.addToRoster(Snorlax);
          }
        } else displayToast(getString(R.string.no_pokemon_message));
        b4_click++;
        turn_text++;
        if (finish_game == 6) {
          Button finish = (Button) findViewById(R.id.finish);
          finish.setEnabled(true);
          finish.setVisibility(View.VISIBLE);
          openBattleArena();
        }
        if (turn_text % 2 == 0) {
          TextView player1_text = (TextView) findViewById(R.id.player1_text);
          TextView player2_text = (TextView) findViewById(R.id.player2_text);
          player1_text.setVisibility(View.VISIBLE);
          player2_text.setVisibility(View.INVISIBLE);
        } else {
          TextView player1_text = (TextView) findViewById(R.id.player1_text);
          TextView player2_text = (TextView) findViewById(R.id.player2_text);
          player2_text.setVisibility(View.VISIBLE);
          player1_text.setVisibility(View.INVISIBLE);
        }
      }
    });

    ImageButton button5 = (ImageButton) findViewById(R.id.button5);
    button5.setOnClickListener(new View.OnClickListener() {

      public void onClick(View v) {
        if (b5_click == 0) {
          finish_game++;
          turn++;
          openActivity5();
          if (turn % 2 == 0) {
            player1.addToRoster(Dratini);
          }
          else {
            player2.addToRoster(Dratini);
          }
        } else displayToast(getString(R.string.no_pokemon_message));
        b5_click++;
        turn_text++;
        if (finish_game == 6) {
          Button finish = (Button) findViewById(R.id.finish);
          finish.setEnabled(true);
          finish.setVisibility(View.VISIBLE);
          openBattleArena();
        }
        if (turn_text % 2 == 0) {
          TextView player1_text = (TextView) findViewById(R.id.player1_text);
          TextView player2_text = (TextView) findViewById(R.id.player2_text);
          player1_text.setVisibility(View.VISIBLE);
          player2_text.setVisibility(View.INVISIBLE);
        } else {
          TextView player1_text = (TextView) findViewById(R.id.player1_text);
          TextView player2_text = (TextView) findViewById(R.id.player2_text);
          player2_text.setVisibility(View.VISIBLE);
          player1_text.setVisibility(View.INVISIBLE);
        }
      }
    });

    ImageButton button6 = (ImageButton) findViewById(R.id.button6);
    button6.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        if (b6_click == 0) {
          finish_game++;
          turn++;
          openActivity6();
          if (turn % 2 == 0) {
            player1.addToRoster(Onix);
          }
          else {
            player2.addToRoster(Onix);
          }
        } else displayToast(getString(R.string.no_pokemon_message));
        b6_click++;
        turn_text++;
        if (finish_game == 6) {
          Button finish = (Button) findViewById(R.id.finish);
          finish.setEnabled(true);
          finish.setVisibility(View.VISIBLE);
          openBattleArena();
        }

        if (turn_text % 2 == 0) {
          TextView player1_text = (TextView) findViewById(R.id.player1_text);
          TextView player2_text = (TextView) findViewById(R.id.player2_text);
          player1_text.setVisibility(View.VISIBLE);
          player2_text.setVisibility(View.INVISIBLE);
        } else  {
          TextView player1_text = (TextView) findViewById(R.id.player1_text);
          TextView player2_text = (TextView) findViewById(R.id.player2_text);
          player2_text.setVisibility(View.VISIBLE);
          player1_text.setVisibility(View.INVISIBLE);
        }
      }
    });
  }


  public void openActivity1() {
    Intent i = new Intent(getApplicationContext(), Activity1.class);
    startActivity(i);
  }


  public void openActivity2() {
    Intent intent = new Intent(this, Activity2.class);
    startActivity(intent);

  }

  public void openActivity3() {
    Intent intent = new Intent(this, Activity3.class);
    startActivity(intent);
  }

  public void openActivity4() {
    Intent intent = new Intent(this, Activity4.class);
    startActivity(intent);
  }

  public void openActivity5() {
    Intent intent = new Intent(this, Activity5.class);
    startActivity(intent);
  }

  public void openActivity6() {
    Intent intent = new Intent(this, Activity6.class);
    startActivity(intent);
  }

  public void openBattleArena ()
  {
    Intent intent = new Intent(this, Battle_Arena_GUI.class);
    startActivity(intent);
  }
}