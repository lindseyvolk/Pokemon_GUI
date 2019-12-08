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
      
      //create a frame
          JFrame frame = new JFrame("Battle Arena");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setSize(400,400);
          
          //create the menu bar
          JMenuBar mb = new JMenuBar();
          JMenu m1 = new JMenu("QUIT");
          JMenu m2 = new JMenu ("Stats");
          //NOTE: Pokemon should actually be based on which pokemon is available, will be
          //linked to GUI with all caught pokemon

          //JMenu m3 = new JMenu ("Choose Pokemon");
          mb.add(m1);
          mb.add(m2);
          //mb.add(m3);
          //JMenuItem m31 = new JMenuItem("Pokemon");
          //m3.add (m31);
    
    //will eventually create loop for when player 1 vs player 2 turn
    //Attack 1, attack 2 need to come from back end
    
          //Create Panel Player 1
          JPanel panel1 = new JPanel();
          JLabel label = new JLabel ("Player 1");
          JButton attack1 = new JButton ("Attack 1");
          JButton attack2 = new JButton ("Attack 2"); 
          JButton defense1 = new JButton ("Defend");
          JButton raise = new JButton ("Raise Stamina"); 
          
          panel1.add(label);
          panel1.add(attack1);
          panel1.add(attack2);
          panel1.add(defense1);
          panel1.add(raise);          
 
 
          //Create Panel Player 2
          JPanel panel2 = new JPanel();
          JLabel label2 = new JLabel ("Player 2");
          JButton attack12 = new JButton ("Attack 1");
          JButton attack22 = new JButton ("Attack 2"); 
          JButton defense12 = new JButton ("Defend");
          JButton raise2 = new JButton ("Raise Stamina"); 
          
          panel2.add(label2);
          panel2.add(attack12);
          panel2.add(attack22);
          panel2.add(defense12);
          panel2.add(raise2);
          
          //Add image of pokemon
          BufferedImage img = ImageIO.read(new URL("http://www.java2s.com/style/download.png"));
          ImageIcon icon = new ImageIcon(img);  
          JLabel lbl = new JLabel();
          lbl.setIcon(icon);
          frame.add(lbl);
                         
          //Add components to the frame
          
          frame.getContentPane().add(BorderLayout.NORTH, mb);
          frame.getContentPane().add(BorderLayout.SOUTH, panel1);
          frame.getContentPane().add(BorderLayout.SOUTH, panel2);
          //frame.getContentPane().add(BorderLayout.CENTER, pokemonimg);
          frame.setVisible(true);
     }
}