//*******************************************
//Cards.Java
//Brianna Scott
//Purpose: To learn and exercise enumerated data types and its usages.
//*******************************************

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Cards
{
   public enum Rank {
      three, 
      four, 
      five, 
      six, 
      seven, 
      eight, 
      nine,
      ten, 
      jack, 
      king, 
      queen,  
      ace
      };
      
      public static void main(String[] args) {
      
      //Declare the variables
      Rank highCard, faceCard, card1, card2;
      
      //Assign the cards by rank
      highCard = Rank.ace;
      faceCard = Rank.queen;
      card1 = Rank.five;
      card2 = Rank.seven;
   
     //Print a line using highCard and faceCard objects
     System.out.println("A blackjack hand: " +highCard + " and " + faceCard);
     
     //declare two values, card1Val and card2Val
     int card1Val, card2Val;
     card1Val = card1.ordinal() + 1;
     card2Val = card2.ordinal() + 1;
     
     //print two lines, using the card1 and card2 objects
     System.out.println("A two card hand: " + card1 + " and " + card2);
     System.out.println("Hand value: " + (card1Val + card2Val));
     }
 }