//**********************************************
//File name: BaseballStats.java
//Name: Brianna Scott
//Purpose: Reads data in from a comma delimited file. Each line
//of the file contains a name followed by a list of symbols
//indicating the result of each at bat: h for hit, o for out,
// w for walk, s for sacrifice. Statistics are computed and printed
//for each player.
//**********************************************

import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

public class BaseballStats
{
   //--------------------------------------
   //Reads baseball stats from a file and counts 
   //total hits, outs, walks, and sacrifice flies
   //for each player
   //--------------------------------------
   public static void main(String[] args) throws IOException
   {
      //decimal format object
      DecimalFormat fmt = new DecimalFormat("0.##");
      
      Scanner fileScan, lineScan;
      String fileName;
      
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the name of the input file: ");
      fileName = scan.nextLine();
      
      fileScan = new Scanner(new File(fileName));
      //read and process each line of the file
      
      while (fileScan.hasNext())
    {
       fileName = fileScan.nextLine();
       lineScan = new Scanner (fileName);
       while (lineScan.hasNext())
       {
          lineScan.useDelimiter(",");
          System.out.println(" "+lineScan.next());
       }
     }
   }
 }