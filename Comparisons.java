//*****************************************
//File Name: Comparsions.java
//Name: Brianna Scott
//*****************************************

import cs1.Keyboard;
import java.util.Scanner;

public class Comparisons
{
   public static void main(String[] args)
   {
      //add your code here
      //hints: Keyboard.readString() to read string
      //hints: new Integer(Keyboard.readInt()) to read an integer
      System.out.println("Largest of abcd, defghi, ab is: " +Compare3.largest("abcd", "defghi", "ab"));
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter 3 integers: ");
      System.out.print("Enter the first integer: ");
      int num1 = input.nextInt();
      
      System.out.print("Enter the second integer: ");
      int num2 = input.nextInt();
      
      System.out.print("Enter the third integer: ");
      int num3 = input.nextInt();
      
      System.out.println("Largest of " +num1+ ", " +num2+ ",and " +num3+ " is: " +Compare3.largest(num1,num2,num3)); 
   }
}