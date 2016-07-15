//outcome of an relationall operator is a boolean operator
class eg5
{
  public static void main(String[] args) {
    boolean b;
    b = false;
    System.out.println(" "+b);
    b = true;
    System.out.println(" "+b);
    if(b) //if b=true executed
    {
      System.out.print("This is executed");
    }
    b=false;
    if(b)// here b =false so not executed
    {
      System.out.print("This is not executed");
    }
    System.out.print(" 10>9 is "+(10>9));
  }
}
