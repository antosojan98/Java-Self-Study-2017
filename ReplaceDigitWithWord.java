/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class ReplaceDigitWithWord {
  
  
  public static void main(String[] args) { 
    String word[]=new String[10];
    String phrase;
    word[0]="zero";
    word[1]="one";
    word[2]="two";
    word[3]="three";
    word[4]="four";
    word[5]="five";
    word[6]="six";
    word[7]="seven";
    word[8]="eight";
    word[9]="nine";
    
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter your string with digits");
    phrase=scan.nextLine();
    int x=phrase.length();
    
    if(phrase.contains("0")==true){
      phrase=phrase.replace("0",word[0]);}
    if(phrase.contains("1")==true){
      phrase=phrase.replace("1",word[1]);}
    if(phrase.contains("2")==true){
      phrase=phrase.replace("2",word[2]);}
    if(phrase.contains("3")==true){
      phrase=phrase.replace("3",word[3]);}
    if(phrase.contains("4")==true){
      phrase=phrase.replace("4",word[4]);}
    if(phrase.contains("5")==true){
      phrase=phrase.replace("5",word[5]);}
    if(phrase.contains("6")==true){
      phrase=phrase.replace("6",word[6]);}
    if(phrase.contains("7")==true){
      phrase=phrase.replace("7",word[7]);}
    if(phrase.contains("8")==true){
      phrase=phrase.replace("8",word[8]);}
    if(phrase.contains("9")==true){
      phrase=phrase.replace("9",word[9]);}
    
    System.out.println(phrase);
    
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
