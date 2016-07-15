//import java.util.*;
/*
import java.io.*;
public class super
{
  public static void main(String args[])
    {
      String str="hello123dinesh120";
      int a[]=new int[10];
      for(int i=0;i<str.length;i++)
      {
        a[i] = str.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        System.out.println(""+a[i]);
      }
    }
}
*/
class go
{
  public static void main(String[] args) {
  //  System.out.println("Hello world");
  String str="hello123dinesh120";
  String [] result;
  while (str.length>0) {
      String part;
      part=((str.Match(/\d+/)).Length);
      System.out.println("Part:"+part);

  }

  }
}
