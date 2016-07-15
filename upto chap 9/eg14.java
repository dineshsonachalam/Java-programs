//using break as a civilized form of goto statements
class eg14
{
  public static void main(String[] args) {
    boolean t = true;
    first:{
        second:{
          third:
          {
            System.out.println("Before break in third");
              if(t)
              break second;
          }
          System.out.println("second will not execute");
        }
      System.out.println("This is after the second block");
    }
  }
}
