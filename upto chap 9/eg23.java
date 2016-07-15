//returning object
class test
{
  int a;
  test(int i)
  {
    a=i;
  }
  test incre()
  {
    test t =new test(a+10);
    return t;
  }

}
class testdemo
{
  public static void main(String[] args) {
    test obj1= new test(2);
    test obj2;
    obj2=obj1.incre();
    System.out.println("ob1.a: "+obj1.a);
    System.out.println("ob2.a: "+obj2.a);
  }
}
