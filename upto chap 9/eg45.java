//variables in java
import java.util.Random;

interface sharedConstants
{
    int no = 0;;
    int yes=1;
    int maybe=2;
    int later=3;
    int soon=4;
    int never=5;
}
class question implements sharedConstants
{
  Random rand = new Random();
  int ask()
  {
      int prob = (int)(100*rand.nextDouble());
      if(prob<30)
       return no;
      else if(prob<60)
       return yes;
      else if(prob<75)
        return later;
      else if(prob<98)
        return soon;
      else
        return never;
  }
}
class demo implements sharedConstants
{
  static void answer(int result)
  {
      switch(result)
      {
          case no:
            System.out.println("NO");
            break;
            case yes:
  System.out.println("Yes");
  break;
  case maybe:
  System.out.println("Maybe");
  break;
  case later:
  System.out.println("Later");
  break;
  case soon:
  System.out.println("Soon");
  break;
  case never:
  System.out.println("Never");
  break;

      }
    }
      public static void main(String args[]) {

        question q = new question();
answer(q.ask());
answer(q.ask());
answer(q.ask());
answer(q.ask());
      }

}
