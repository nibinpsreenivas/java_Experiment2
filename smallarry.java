import java.util.*;
class smallarry
{
  public static void main(String args[])
  { 
     
     Scanner obj = new Scanner(System.in);
     System.out.println("how many elements");
     int n = obj.nextInt();
     int a[] = new int[10];
     System.out.println("enter the elements into the array");
      for(int i=0;i<n;i++)
      a[i] = obj.nextInt();
      
      int s=a[0];
     for(int i=1;i<n;i++)
      if(a[i]<s)
        s=a[i];
    System.out.println("the smallest  element is "+s);
  }
}
