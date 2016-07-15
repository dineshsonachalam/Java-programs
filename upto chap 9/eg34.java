//nerupuda moment
//overloading Varang methods
class test
{
  static void vaTest(int ...v)
  {
  System.out.print("no of arguments:"+v.length+"contents:");
  for (int x : v) {
    System.out.print(x+" ");
  //  System.out.print(x+" ");
    }
  }
  static void vaTest(boolean ...v)
  {
    System.out.print("no of arguments:"+v.length+"contents:");
    for (boolean x :v ) {
      System.out.print(x + " ");
      System.out.println();
    }
  }
  static void vaTest(String msg,int ...v)
  {
    System.out.print("no of arguments:"+v.length+"contents:");
    for(int x:v)
    {
        System.out.print(x+" ");
        System.out.println();
    }
  }
    public static void main(String[] args) {
      vaTest(1,2,3);
      vaTest("Testing:",1,2);
      vaTest(true,false,true);
    }

}
