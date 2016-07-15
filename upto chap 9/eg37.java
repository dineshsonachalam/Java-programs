class A //creating a superclass A
{
  int i;
}
//subclass
class B extends A
{
    int i;// this hides i in A
    void assign(int a,int b)
    {
        super.i=a; //assign value to i in A
        i=b;//assign value to the subclass

    }
    void display()
    {
        System.out.println("value in superclass i:"+super.i);
        System.out.println("value in subclass i:"+i);
    }
}
class demo
{
  public static void main(String[] args) {


    B o = new B();
    o.assign(5,10);
    o.display();
  }
}
