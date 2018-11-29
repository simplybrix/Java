//**********************************************
//File Name: MoneyTest.java
//Name: Brianna Scott
//Purpose: The program will read a double value representing a 
//monetary amount. Then determine the fewest number of each bill 
//and coin needed to represent that amount, starting with the highest 
//(assume that a ten-dollar bill is the maximum size needed).
//**********************************************

import java.util.Scanner;

public class MoneyTest
{

   //main calculates the monetary value of the input given
   public static void main(String[] args)
   {
     //Declare the values in double and int
     double result;
     int quarters, dimes, nickels, pennies,tens, fives, ones;
     
     //Create a new scanner to read the input
     Scanner sc = new Scanner(System.in);
     
     //this will read the value from the keyboard
     System.out.print("Enter the amount: ");
     result = sc.nextDouble();
     
     //deriving in terms of $10
     tens = (int) (result/10);
     result = result%10;
     
     //deriving in terms of $5
     fives = (int) (result/5);
     result = result%5;


     //deriving in terms of $1
     ones = (int) (result/1);
     result = result%1;


     //deriving in terms of $0.25
     quarters = (int) (result/0.25);
     result = result%0.25;


     //deriving in terms of $0.10
     dimes = (int) (result/0.10);
     result = result%0.10;

     //deriving in terms of $0.05
     nickels = (int) (result/0.05);
     result = result%0.05;

     //deriving in terms of $0.01
     pennies = (int) (result/0.01);
     result = result%0.01;
     
     //print the result
     System.out.println(tens + " ten dollar bills");
     System.out.println(fives + " five dollar bills");
     System.out.println(ones + " ones dollar bills");
     System.out.println(quarters + " quarters");
     System.out.println(dimes + " dimes");
     System.out.println(nickels + " nickels");
     System.out.println(pennies + " pennies");
   }
}