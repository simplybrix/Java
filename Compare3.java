//*****************************************
//File Name: Compare3.java
//Name: Brianna Scott
//*****************************************

public class Compare3
{
   public static Comparable largest(Comparable c1, Comparable c2, Comparable c3)
   {
      //add your code here
      //hints: use compareTo function in the Comparable class
      
      if (c1.compareTo(c2) >= 0){
        if(c1.compareTo(c3) >=0){
        return c1;
      }
      else{
         return c3;
      }
    }
      else if(c2.compareTo(c3) >= 0){
         return c2;
      }
      else{
      return c3;
      }
   }
}