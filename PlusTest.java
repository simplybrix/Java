//**********************************************
//File Name: PlusTest.java
//Name: Brianna Scott
//Purpose: Demostrate the different behaviors of the + operator
//**********************************************
public class PlusTest
{
   //--------------------
   //main prints some expressions using the + operator
   //--------------------
   
   public static void main(String[] args)
   {
      System.out.println();
      System.out.println("This is a long string that is the\n"+"concatenation of two shorter strings.\n");
      System.out.println("The first computer\nwas invented about\n" + 55 + " years ago.\n");
      //---------------------------------------
      System.out.println("8 plus 5 is " + 8+5);
      //The one above prints out 85 because it is evaluated
      //left to right because it does not have a set of parentheses.
      //---------------------------------------
      
      //---------------------------------------
      System.out.println("8 plus 5 is " +(8+5));
      //The one above prints out 13 because it contains more than one
      //operation expressions inside parentheses and is evaluated first. 
      //---------------------------------------
      
      //---------------------------------------
      System.out.println(8+5+" equals 8 plus 5.");
      //The one above prints out 13 because both operands are numbers. 
      //Therefore, + is treated as ordinary addition.
      //---------------------------------------
   }
}