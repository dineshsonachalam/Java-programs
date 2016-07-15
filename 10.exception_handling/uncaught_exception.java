class ex
{
static void subroutine() {
      int d=0;
      int a=42/d; //anything divided by 0 is infinity ,it throws the corresponding exception.
  }
  public static void main(String[] args) {

    ex.subroutine();
  }
}
