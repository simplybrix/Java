//***********************************************
//File Name: StringManips.java
//Name: Brianna Scott
//Purpose: Test several methods for manipulating String Objects
//***********************************************

import java.util.Scanner;

public class StringManips
{ 
   public static void main(String[] args)
   {
      String phrase = new String("This is a String test.");
      int phraseLength;  //number of characters in the phrase String
      int middleIndex;  //index of the middle character in the String
      String middle3;
      String city, state;
      String firstHalf; //first half of the phrase String
      String secondHalf; //second half of the phrase String
      String switchedPhrase;  // a new phrase with original halves switched
      
      
      //computer the length and middle index of each phrase
      phraseLength = phrase.length();
      middleIndex = phraseLength/2;
      
      //get the substring for each half of the phrase
      firstHalf = phrase.substring(0, middleIndex);
      secondHalf = phrase.substring(middleIndex, phraseLength);
      middle3 = phrase.substring(middleIndex - 1, middleIndex + 2);
      
      //concatenate the firstHalf at the end of the secondHalf
      switchedPhrase = secondHalf.concat(firstHalf);
      switchedPhrase = switchedPhrase.replace(' ', '*');
      
      Scanner scan = new Scanner(System.in);
         //prompt the user to enter their city
         System.out.print ("Enter a city: ");
         city = scan.nextLine();
         
         //prompt the user to enter their state
         System.out.print ("Enter a state: ");
         state =scan.nextLine();
         
         //put city in lowercaseans state in uppercase
         city= city.toLowerCase();
         state= state.toUpperCase();

      
      //print information about the phrase
      System.out.println();
      System.out.println("Original phrase: " + phrase);
      System.out.println("Length of the phrase: " + phraseLength+ " characters");
      System.out.println("Index of the middle: " +middleIndex);
      System.out.println("Character at the middle index: " +phrase.charAt(middleIndex));
      System.out.println("Switched phrase: " + switchedPhrase);
      System.out.println("The middle 3 are: " + middle3);
      System.out.println(state+ city + state);
      System.out.println();
      }
   }