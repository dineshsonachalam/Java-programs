//example of inheritance
//creating a superclass
class A
{
  int i,j;
  void show()
  {
    System.out.println("i:"+i+" "+"j:"+j);
  }
}
class B extends A
{
    int k;
    void sum()
    {
      System.out.print("i+j+k:"+(i+j+k));
    }
}
class demo
{
    public static void main(String[] args) {
      A obj=new A();
      B obj1= new B();
      obj.i=10;
      obj.j=10;
      obj.show();
      //accesing using the inherited class
      obj1.i=15;
      obj1.j=15;
      obj1.k=10;
      obj1.sum();

    }
}
