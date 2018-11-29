//*******************************************
//File Name: Guess.java
//Name: Brianna Scott
//Purpose: Play a game where the user guesses a number from 1 to 10
//********************************************

import java.util.Random;
import java.util.Scanner;

public class Guess
{
   public static void main(String[] args)
   {
      int numToGuess; //Number the user tries to guess
      int guess; //the user's guess
      int tries = 0;
      
      Scanner scan = new Scanner(System.in);
      Random generator = new Random();
      
      //randomly generate the number to guess
      numToGuess = generator.nextInt(10) + 1;
       
      //print message asking user to enter a guess
      System.out.println("Enter a guess from 1 to 10: ");
      
      //read in guess & start counting the number of tries
      guess = scan.nextInt();
      tries++;
      
      while(guess != numToGuess)//keep going as long as the guess is wrong
      {
         //print message saying the guess is wrong
         //print a message saying the guess is too high or low         
            if(guess < numToGuess)
            {
                System.out.println("Your answer is incorrect.");
               System.out.println("Your number is too low. Please try again.");
               //get another guess from the user
               System.out.println("Your guess?");
               guess = scan.nextInt();  
               tries++;            
            }
         else if (guess > numToGuess)
         {
            System.out.println("Your answer is incorrect.");
            System.out.println("Your number is too high. Please try again.");
            //get another guess from the user
            System.out.println("Your guess?");
            guess = scan.nextInt();
            tries++;
         }
         else
         {
            //print a message saying the guess is correct
            //print out how many guesses have been made
             System.out.println("Your answer is correct. You win!");
             System.out.println(" It took you "+ tries +" tries."); 
         }
      }
   }
 }