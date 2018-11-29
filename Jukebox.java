//*********************************************
//File name: Jukebox.java
//Name: Brianna Scott
//Purpose: Creates a jukebox to play user selected music.
//*********************************************

import javax.swing.*;

public class Jukebox
{
  //-------------------------------------------------
  //Creates and displays the controls for a jukebox.
  //-------------------------------------------------
   public static void main(String[] args)
   {  
      JFrame frame = new JFrame("Jukebox");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frame.getContentPane().add(JukeboxControls());
      
      frame.pack();
      frame.setVisible(true);
   }
}