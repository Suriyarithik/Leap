# Leap
import java.io.*;
import java.util.*;
public class Alpha
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if((n%4==0)||(n%100!==0))
    {
      System.out.pritnln("THIS IS A LEAP YEAR");
    }
    else if(n%100==0)
    {
       System.out.pritnln("THIS IS  NOT A LEAP YEAR");
     }  
    else if(n%400==0)
    {
       System.out.pritnln("THIS IS A LEAP YEAR");
    }
    else
    {
       System.out.pritnln("THIS IS NOT A LEAP YEAR");
    }
  }
}  
