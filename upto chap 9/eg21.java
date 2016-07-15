//using object as a parmaeter
class test
{
  int a,b;
  test(int i,int j)
  {
    a=i;
    b=j;
  }
  //returns true if o equals to the invoking object
  boolean equals(test o)
  {
    if(o.a==a && o.b==b)
    return true;
    else
    return false;
  }
}

class testdemo
{
   public static void main(String[] args) {

     test obj=new test(100,33);
     test obj1=new test(100,33);
     test obj2=new test(-1,-1);

     System.out.println("ob1==ob2:"+obj.equals(obj1));
     System.out.println("ob1==ob3:"+obj.equals(obj2));
   }
}
