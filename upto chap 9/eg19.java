//method overloading
class overload
{
  void test()
  {
    System.out.println("No parameters");
  }
  void test(int a)
  {
    System.out.println(" "+a);
  }
  void test(int a,int b)
  {
    System.out.println(" "+a+" "+b+" ");
  }
  void test(double d)
  {
    System.out.println(" "+d);
  }
}
class overloadDemo
{
  public static void main(String[] args) {
    overload obj=new overload();
    obj.test();
    obj.test(5);
    obj.test(5,10);
    obj.test(290.98);
  }
}
