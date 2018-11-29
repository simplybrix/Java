//****************************************
//File Name: ComparePlayers.java
//Brianna Scott
//Purpose: Reads in two player objects and tells whether they represent the same player.
//****************************************

import java.util.Scanner;

public class ComparePlayers
{
   public static void main(String[] args)
   {
      Player player1 = new Player();
      Player player2 = new Player();
      
      Scanner scan = new Scanner(System.in);
       
      //Prompt for and read in the information for player 1
      player1.readPlayer();
      
      //Prompt for and read in the information for player 2 
      player2.readPlayer();
        
      //Compare player1 to player2 and print a message saying whether they are equal
      if (player1.equals(player2)){
         System.out.println("This is the same person.");
         }
         
      else{
         System.out.println("The two players are different people.");
      }    
    }  
 }