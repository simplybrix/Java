//********************************************
//File Name: Grades.java
//Brianna scott
//Purpose: Use Student class to get test grades for two students and compute averages
//********************************************

public class Grades
{
   public static void main(String[] args)
   {
      //Create students 1-3, Mary, Mike, and Brianna
      Student student1 = new Student("Mary");
      Student student2 = new Student("Mike");
      Student student3 = new Student("Brianna");
      
      //input grades for all students
       student1.inputGrades();
       student2.inputGrades();
       student3.inputGrades();
      //print average for all students
      System.out.println();
      System.out.println("Average of Mary: "+student1.getAverage());
      System.out.println("Average of Mike: "+student2.getAverage());
      System.out.println("Average of Brianna: "+student3.getAverage());
      
      System.out.println("Student 1: " + student1);
      System.out.println("Student 2: " + student2);
      System.out.println("Student 3: " + student3);
      }
}
      