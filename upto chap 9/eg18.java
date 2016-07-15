//using stack class
class stack
{
  int stck[]=new int[20];
  int tos;//top of stack
  stack() //default construtor and assigning its value to -1
  {
    tos=-1; //this is method is called as soon as the object is created
  }
  //push an item into the stack
  void push(int item)
  {
    if(tos==9)
    System.out.println("stack is full");
    else
    stck[++tos]=item;
  }
  int pop()
  {
    if(tos==-1)
    {
      System.out.println("The stack is empty");
    }


      return stck[tos--];

  }
}
class stackdemo
{
    public static void main(String[] args) {
        int i;
        //initializing object
        stack obj = new stack();
        stack obj1 = new stack();
        for(i=0;i<10;i++)
        {
          obj.push(i);
        }
        for(i=10;i<20;i++)
        {
          obj1.push(i);
        }
        for(i=0;i<10;i++)
        {
            System.out.println(" "+(obj.pop()));
        }
        for(i=0;i<10;i++)
        {
            System.out.println(" "+(obj1.pop()));
        }

    }
}
