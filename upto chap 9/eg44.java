
class FixedStack implements IntStack
{
    private int stck[];
    private int tos;

    //allocate and initialize the stack
    FixedStack(int size)
    {
        stck = new int[size];
        tos=-1;
    }
    //push an item into the stack
    public void push(int item)
    {
        if(tos==stck.length-1)
        {
          //  System.out.println("The system is full");
            int temp[] = new int[stck.length * 2]; // double size
            for(int i=0; i<stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        }
        else
          stck[++tos]=item;
    }
    //pop an item into the stack
    public int pop()
    {
        if(tos<0)
        {
            System.out.println("the stack is empty");
            return 0;
        }
        else
          return stck[tos--];
    }


}
class demo
{
    public static void main(String[] args) {
      FixedStack mystack1 =new FixedStack(5);
      int i;
      for(i=0;i<10;i++)
      {
          mystack1.push(i);
      }
      for (i=0;i<10;i++ ) {
        System.out.println(" "+mystack1.pop());
      }
    }
}
