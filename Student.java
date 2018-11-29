//******************************************
//File Name: Student.java
//Name: Brianna Scott
//Purpose: Define a student class that stores name, score on test 1, and score on test 2.
//Methods prompt for and read in grades, compute the average, and return a string
//containing student's info.
//******************************************

import java.util.Scanner;

public class Student
{

   //declare instance data
   private String name;
   private double test1, test2;
   //---------------------
   //constructor
   //---------------------
   
   public Student(String studentName)
   {
      //add body of constructor
      this.name = studentName;
      
   }
   
   //----------------------------------------
   //inputGrades: prompts for and reads in student's grades for test1 and test2
   //Use name in prompts, e.g., "Enter Joe's score for test1".
   //----------------------------------------
   
   public void inputGrades()
   {
      //add body of inputGrades
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter" +name+"'s score for test 1: ");
      test1 = sc.nextDouble();
      System.out.println("Enter" +name+"'s score for test 2: ");
      test2 = sc.nextDouble();
   }
   
   //----------------------------------------
   //getAverage: compute and return the student's test average
   //----------------------------------------
   
   //add header for getAverage
   public double getAverage()
   {
      //add body of getAverage
      return(test1+test2)/2.0;
   }
   
   //--------------------------------------
   //getName: Print the name of the student
   //--------------------------------------
   
   //add header for printName 
   public void printName()
   {
      //add body of print name
      System.out.println(name);
   }
   
     @Override
   public String toString() {
       return "Name: "+name+" Test1: "+test1+" Test2: "+test2;
   }
   
 }
 
   