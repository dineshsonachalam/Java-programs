class jav
{
  static void vaTest(String msg,int...v)
  {
    System.out.println(msg+v.length+"Contents:");

    for(int x:v)
    {
        System.out.print(x+" ");

    }
    System.out.println();
  }
  public static void main(String[] args) {
    vaTest("one arguments:",10);
    vaTest("second arguments",1,2,3);
    vaTest("no arguments");
  }
}
