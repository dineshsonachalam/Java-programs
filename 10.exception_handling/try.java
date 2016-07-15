class exc2
{
    public static void main(String[] args) {

      int d,a;
      try
      {
          //monitor the block of code
          d=0;
          a=42/d; //throws an exception which is catched
          System.out.println("This will not be printed");

      }
      catch(ArithmeticException e)
      {
          //catch divide-by-zero exception
          System.out.println("Division by zero");
      }
        System.out.println("After the catch statement");
    }
};
