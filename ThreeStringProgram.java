/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class ThreeStringProgram {
  
  
  public static void main(String[] args) { 
    String s1,s2,s3;
    
    Scanner s=new Scanner(System.in);
    
    System.out.println("Enter first string");
    s1=s.nextLine();
    System.out.println("Enter second string");
    s2=s.nextLine();
    System.out.println("Enter third string");
    s3=s.nextLine();
    
    if(s1.compareTo(s2)>0)
      System.out.println(s2);
     if(s2.compareTo(s3)>0)
      System.out.println(s3);
      if(s1.compareTo(s3)>0)
      System.out.println(s1);
     
    
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
