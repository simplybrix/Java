//*****************************************
//File Name: Player.java
//Brianna Scott
//Purpose: Defines a Player class that holds information about a athlete.
//*****************************************

import java.util.Scanner;

public class Player
{
   private String name;
   private String team;
   private int jerseyNumber;
   
   
   //------------------------------------------
   //prompts for and reads in the player's name, team and
   //jersey number.
   //------------------------------------------
   
   public void readPlayer()
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Name: ");
      name = scan.nextLine();
      System.out.print("Team: ");
      team = scan.nextLine();
      System.out.print("Jersey Number: ");
      jerseyNumber = scan.nextInt();
   }
   
 }