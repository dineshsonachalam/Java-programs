//method overriding
//method with different types of signatures are overloaded not overrriden
class A
{
  int i,j;
  A(int a,int b)
  {
    i=a;
    j=b;
  }
  void show()
  {
      System.out.println("i:"+i+" "+"j:"+j);

  }
}
class B extends A
{
    int k;
    B(int a,int b,int c)
    {
      super(a,b);
      k=c;
    }
    void show(String msg)
    {
      //    super.show(); //calls the superclass
          System.out.println(msg+k);
    }
}
class demo
{
    public static void main(String[] args) {

      B o= new B(1,2,3);
      o.show("This is K:");
      o.show();

    }
}
