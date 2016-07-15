// to find factorial
class factorial
{
  int n,result;
  int fact(int n)
  {
    if(n==1)
     return 1;
    result=fact(n-1)*n;
    return result;
  }
}
class demo
{
  public static void main(String[] args) {
    factorial f = new factorial();
    int r=f.fact(5);
    System.out.println(" "+r);
  }
}
