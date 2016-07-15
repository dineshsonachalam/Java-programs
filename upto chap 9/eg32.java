//variable length arguments
class var
{
  static void vaTest(int ...v)
  {
    System.out.println("no of arguments:"+v.length+" contents:");
    for(int x:v)

      System.out.println(" "+x);

  }
  public static void main(String[] args) {
  /*  int n1[]={1};
    int n2[]={1,2,3};
    int n3[]={};*/
    vaTest(10,20,30);
    vaTest(1);
    vaTest();
  }
}
