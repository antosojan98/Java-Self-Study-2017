/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class Temp_Class {
  double temp;
  char ch;
  
  public Temp_Class() { 
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter your temperature");
    temp=scan.nextDouble();
    
    System.out.println("Enter element E(ethylfreeze), e(ethylboil), O(oxygenfreeze), o(oxygenboil), W(waterboiling),w(waterfreeze)");
    
  }
  public void isEthylFreezing()
  {
    boolean t;
    boolean f;
    t=true;
    f=false;
    if(temp==-1*173)
      System.out.println(t);
    else
      System.out.println(f);
  }
   public void isEthylBoiling()
  {
    boolean t1;
    boolean f1;
    t1=true;
    f1=false;
    if(temp==172)
      System.out.println(t1);
    else
      System.out.println(f1);
  }
    public void isOxygenBoiling()
  {
    boolean t2;
    boolean f2;
    t2=true;
    f2=false;
    if(temp==-1*362)
      System.out.println(t2);
    else
      System.out.println(f2);
  }
     public void isOxygenFreezing()
  {
    boolean t3;
    boolean f3;
    t3=true;
    f3=false;
    if(temp==-1*306)
      System.out.println(t3);
    else
      System.out.println(f3);
  }
      public void isWaterFreezing()
  {
    boolean t4;
    boolean f4;
    t4=true;
    f4=false;
    if(temp==32)
      System.out.println(t4);
    else
      System.out.println(f4);
  }
       public void isWaterBoiling()
  {
    boolean t5;
    boolean f5;
    t5=true;
    f5=false;
    if(temp==212)
      System.out.println(t5);
    else
      System.out.println(f5);
  }
  public static void main(String[] args) { 
    Temp_Class tc=new Temp_Class();
    if(ch=='E')
    {
    tc.isEthylFreezing();
    System.out.println(tc.isEthylFreezing());
    
  }
  
 
  
}
}
