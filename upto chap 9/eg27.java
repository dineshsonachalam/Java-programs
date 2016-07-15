//static method and variable can be accessed outside the class using
//syntax: classname.method()

class stat
{
  static int a=5;
  static int b=1;
  static void callme()
  {
    System.out.println("a= "+a);
  }
}
class staticDemo
{
  public static void main(String[] args) {
    stat.callme();
    System.out.println("b= "+stat.b);
  }
}
