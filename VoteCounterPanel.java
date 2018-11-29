//****************************************
//File name: VoteCounterpanel.java
//Brianna Scott
//Purpose: Demonstrate a graphical user interface and event listeners to
//tall votes for two candidates, Joe and Sam.
//****************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VoteCounterPanel extends JPanel
{
   private int votesForJoe, votesForSam;
   private JButton joe;
   private JButton sam;
   private JLabel labelJoe;
   private JLabel labelSam;
   private JLabel winnerLabel; //add winner label
   
   //----------------------------------------
   //Constructor: Sets up the GUI.
   //----------------------------------------
   public VoteCounterPanel()
   {
      votesForJoe = 0;
      joe = new JButton("Vote for Joe");
      joe.addActionListener( new JoeButtonListener());
      labelJoe = new JLabel("Votes for Joe:" + votesForJoe);
      
      add(joe);
      add(labelJoe);
      
      setPreferredSize(new Dimension(300, 40));
      setBackground(Color.cyan);
      
      votesForSam = 0;
      sam = new JButton("Vote for Sam");
      sam.addActionListener( new SamButtonListener());
      labelSam = new JLabel("Votes for Sam:" + votesForSam);
      winnerLabel = new JLabel("---");
      
      add(sam);
      add(labelSam);
      add(winnerLabel); //add winner label
      
      setPreferredSize(new Dimension(300, 40));
      setBackground(Color.cyan);
   }
   
   //***************************************
   //Represents a listener for button push(action) events
   //***************************************
   private class VoteButtonListener implements ActionListener
   {
   
   //---------------------------------------
   //Updates the counter and label when votes for Joe
   //button is pushed
   //--------------------------------------
   public void actionPerformed(ActionEvent event)
   {
      if(event.getSource() == joe)
      {
         votesForJoe++;
         labelJoe.setText("Votes for Joe: " + votesForJoe);
      }
      else
      {
         votesForSam++;
         labelSam.setText("Votes for Sam: " + votesForSam);
      }
      
      if (votesForJoe > votesForSam)
         winnerLabel.setText("Joe is ahead in the vote count!!");
      else if (votesForJoe < votesForSam)
         winnerLabel.setText("Sam is ahead in the vote count!!");
      else
         winnerLabel.setText("Sam and Joe are tied!!");
   }
  }
  
  