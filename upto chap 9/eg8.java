//addition of matrix
class eg8
{
  public static void main(String[] args) {
    int two[][]=new int[4][5];
    int k=0;
    for(int i=0;i<4;i++)
      for(int j=0;j<5;j++)
      {
          two[i][j]=k;
          k++;
        //  System.out.print(" "+two[i][j]);
        //  System.out.println();
      }
      for(int i=0; i<4; i++) {
          for(int j=0; j<5; j++)
          System.out.print(two[i][j]+" ");
          System.out.println();
}

  }
}
