//casting incompatible data variable

class eg6
{
  public static void main(String[] args) {
    byte b;
    int i=289;
    double d=200.234;
    System.out.println("conversion of int "+i+" into byte value "+(b=(byte) i));

    System.out.println("conversion of double "+d+" into int value "+(i=(int) d));
  }
}
