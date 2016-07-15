//calculating distance travelled by the light in 1000 days
class eg4
{
  public static void main(String[] args)
  {
      int lightspd=186000;
      long days=1000,s,distance;
      s= days*24*60*60;
      distance=lightspd*s;
      System.out.println("Distance travelled by light in"+" "+days+" is "+distance+" miles");
  }
}
