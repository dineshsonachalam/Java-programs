class A
{
    //nested interface
    public interface NestedIf
    {
        boolean isNotNegative(int x);
    }
}
class B implements A.NestedIf
{
    public boolean isNotNegative(int x)
    {
        return x<0?false:true;
    }
}
class demo
{
    public static void main(String[] args) {

        //use a nested interface reference

        A.NestedIf o =new B();
        if(o.isNotNegative(10))
        {
            System.out.println("10 is not negative");
        }
        if(o.isNotNegative(-12))
        {
            System.out.println("wont get displayed");
        }
    }
}
