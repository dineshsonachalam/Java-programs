//constructor overloading
class box
{
  double width;
  double height;
  double depth;
  box(box o)
  {
    width=o.width;
    height=o.height;
    depth=o.depth;
  }
  box()
  {
    width=-1;
    height=-1;
    depth=-1;
    //when no value is passed
  }
  box(double w,double h,double d)
  {
    width=w;
    height=h;
    depth=d;
  }
  //for cube
  box(double d)
  {
    width=height=depth=d;
  }
  void vol()
  {
    double volume = width*height*depth;
    System.out.println(" "+volume);
  }

}
class boxdemo
{
  public static void main(String[] args) {
    box obj=new box();              //:construtor is called whenever an object is created
    box obj1=new box(2,2,2);
    box obj2=new box(3);
    box myclone=new box(obj1);//crates a copy of object1
    /*
    obj.box();
    obj1.box(2.5,2.1,2.3); youre not using method for invoking a method
    obj2.box(3);
    */
    obj.vol();
    obj1.vol();
    obj2.vol();
    myclone.vol();
  }
}
