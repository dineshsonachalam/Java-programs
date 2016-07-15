//improved version of stack operation
class stackDemo
{
    private int stck[];
    private int tos;
    stackDemo(int size)
    {
      stck = new int[size];
      tos=-1;
    }
    void push(int item)
    {
      if(tos==(stck.length-1))
      {
        System.out.println("stack is full");
      }
      else
        stck[++tos]=item;
    }
    int pop()
    {
      if(tos<0)
      {
        System.out.println("stack is empty");
        return 0;
      }

      else

        return stck[tos--];

    }
}

class stackMain
{
  public static void main(String args[]) {
    int i;
    stackDemo obj = new stackDemo(10);
    for (i=0;i<10;i++) {
        obj.push(i);
    }
    for (i=0;i<10;i++) {
      //  obj.pop(i);
        System.out.println(" "+obj.pop());
    }

}
}
