class outer {
  int x=100;
  void display()
  {
      inner in = new inner();
      in.test();
  }
  class inner() {
    void test()
    {
        System.out.println(" "+x);
    }
  }
}
class Demo
{
  public static void main(String args[]) {
      outer o =new outer();
      o.display();
  }
}
