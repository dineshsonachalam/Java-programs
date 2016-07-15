//objects are passed as reference
class test
{
  int a,b;
   test(int i,int j)
   {
     a=i;
     b=j;
   }
   //passed as object
   void pass(test o)
   {
     o.a*=2;
     o.b/=10;
   }
}
class testdemo
{
  public static void main(String[] args) {
    test obj = new test(2,2);
    //obj.test(12,10);
    System.out.println("The values before call "+obj.a+" "+obj.b);
    obj.pass(obj);
    System.out.println("ob.a and ob.b after call "+obj.a+" "+obj.b);

  }
}
