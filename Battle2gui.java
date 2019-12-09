import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.net.URL;
//from   ww  w . j a v a 2  s  . co m
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


class gui{
      public static void main(String args[]) throws Exception {
      
      /*add pokemon by creating an array of objects 1-8. Pokemon 1-4 for P1
      Pokemon 5-8 for P2. Added in based on which pokemon is chosen.
      i.e. if pikachu dies, P1 can become bulbasaur).*/
      
      //insert function that chooses the pokemon based on the id number.
      //Shuarya should add this to the Pokemon class
      
      //create a frame
          JFrame frame = new JFrame("Battle Arena");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setSize(400,400);
          frame.setLocationRelativeTo(null);
          frame.add(new AttackMotion());
          
          
          //create the menu bar
          JMenuBar mb = new JMenuBar();
          
          //back to home
          JMenu m1 = new JMenu("QUIT");
          
          //look at stats
          JMenu m2 = new JMenu ("Stats");
          
          //NOTE: Pokemon should actually be based on which pokemon is available, will be
          //linked to GUI with all caught pokemon
          
          //loop through the array of pokemon when they are chosen
          //int id = pokemon.getId();
          /*for (int i=0; i<num_pokemon; i++){
              if (pokemon is chosen){
                  pokemon 1= pokemon matched to id
                  pokemon 2 = pokemon matched to id
              }
          }
          */

          JMenu m3 = new JMenu ("Choose Pokemon");
          //links to Pokedex
          mb.add(m1);
          mb.add(m2);
          mb.add(m3);
          
          //this will all come from the Pokemon calls
          
          //will need to call for each of the Pokemon objects
          /*double p1hp = pokemon.getHealth();
          double p1type = pokemon.getType();
          double p2hp = pokemon.getHealth();
          double p2type = battle.AttackUp();   
          */       
          
          
          JLabel type1 = new JLabel ("Player 1 type");
          JLabel hp1 = new JLabel ("Player 1 health");
          JLabel type2 = new JLabel ("Player 2 type");
          JLabel hp2 = new JLabel ("Player 2 health");
          mb.add(type1);
          mb.add(hp1);
          mb.add(type2);
          mb.add(hp2);
          
    
    //will eventually create loop for when player 1 vs player 2 turn
    //Attack 1, attack 2 need to come from back end
    
          //Create Panel Player 1
          //calls from Pokemon Stats
          
           /*
           string p1name = pokemon.getName();
           string p1att1 = pokemon.getMoves();
           string p1att2 = pokemon.getMoves2();
           string p1def = pokemon.getDefense();
           string p1hp = PokemonBattleTest.getAttack();
           */
          
          JPanel panel1 = new JPanel();
          JLabel label = new JLabel ("Player 1");
          JLabel name1 = new JLabel ("Name_1");
          JButton attack1 = new JButton ("Attack 1");
          JButton attack2 = new JButton ("Attack 2"); 
          JButton defense1 = new JButton ("Defend");
          JButton raise = new JButton ("Raise Attack"); 
          
          panel1.add(label);
          panel1.add(name1);
          panel1.add(attack1);
          panel1.add(attack2);
          panel1.add(defense1);
          panel1.add(raise);          
 
 
          //Create Panel Player 2
          //Pokemon_Name=call to Pokemon class
          
           /*
           string p2name = pokemon.getName();
           string p2att1 = pokemon.getMoves();
           string p2att2 = pokemon.getMoves2();
           string p2def = pokemon.getDefense();
           string p2hp = pokemon.getAttack();
           */
          JPanel panel2 = new JPanel();
          JLabel label2 = new JLabel ("Player 2");
          JLabel name2 = new JLabel ("Pokemon_Name");
          JButton attack12 = new JButton ("Attack 1");
          JButton attack22 = new JButton ("Attack 2"); 
          JButton defense12 = new JButton ("Defend");
          JButton raise2 = new JButton ("Raise Attack"); 
          
          panel2.add(label2);
          panel2.add(name2);
          panel2.add(attack12);
          panel2.add(attack22);
          panel2.add(defense12);
          panel2.add(raise2);
          
          //Add image of pokemon
          //can do this with string cat id number and filepath
          //BufferedImage img = ImageIO.read(new File("c:\\image\\pokemoni.jpg"));
          BufferedImage img = ImageIO.read(new URL("http://www.java2s.com/style/download.png"));
          ImageIcon icon = new ImageIcon(img);  
          JLabel lbl = new JLabel();
          lbl.setIcon(icon);
          frame.add(lbl);
                         
          //Add components to the frame
          
          frame.getContentPane().add(BorderLayout.NORTH, mb);
          // if (play1_turn) {
            frame.getContentPane().add(BorderLayout.SOUTH, panel1);
           //} else {
            frame.getContentPane().add(BorderLayout.SOUTH, panel2);
           //}
          //frame.getContentPane().add(BorderLayout.CENTER, pokemonimg);
          frame.setVisible(true);
     }
}

//Note, this code was borrowed from https://stackoverflow.com/questions/19629257/java-moving-an-object-across-the-screen
class AttackMotion extends JComponent {

   private int lastX = 0;
   
   public AttackMotion() {
        Thread animationThread = new Thread(new Runnable() {
            public void run() {
                  while (true) {
                       repaint();
                       try {Thread.sleep(10);} catch (Exception ex) {}
                  }
            }
        } );
        
        animationThread.start();
   }
   public void paintComponent(Graphics g) {
        Graphics2D gg = (Graphics2D) g;

        int w = getWidth();
        int h = getHeight();

        int trainW = 100;
        int trainH = 10;
        int trainSpeed = 3;

        int x = lastX + trainSpeed;

        if (x > w + trainW) {
            x = -trainW;
        }

        gg.setColor(Color.BLACK);
        gg.fillRect(x, h/2 + trainH, trainW, trainH);

        lastX = x;
    }
}
//linecheck
       
               