//****************************************
//File name: VoteCounter.java
//Brianna Scott
//Purpose: Demonstrate a graphical user interface and event listeners to
//tall votes for two candidates, Joe and Sam.
//****************************************

import javax.swing.JFrame;

public class VoteCounter
{
   //---------------------------
   //Creates the main program frame
   //--------------------------
   public static void main(String[] args)
   {  
      JFrame frame = new JFrame("Vote Counter");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frame.getContentPane().add(new VoteCounterPanel());
      
      frame.pack();
      frame.setVisible(true);
      
   }
}