class eg12{
  public static void main(String[] args) {
    int a[]={1,2,3,4,5};
    int sum=0;
    for (int x :a ) {
      System.out.println("value is: "+x);
      sum+=x;
      if(x==3)
      break;

    }
    System.out.println("sum is "+sum);
  }

}
