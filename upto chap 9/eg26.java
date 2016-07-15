class usestatic
{
  static int a=5,b;
  static void meth(int x)
  {
    System.out.println("x:"+x);
    System.out.println("a:"+a);
    System.out.println("b:"+b);
  }
  static{
    System.out.println("static block is initialized");
    b=a*4;
  }
  public static void main(String[] args) {
    meth(44);
  }
  
}
