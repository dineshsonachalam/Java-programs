class box
{
  double width;
  double height;
  double depth;
  void assign()
  {
    width=10;
    height=1;
    depth=10;
  }
/*  void assign(double w,double h,double d) //void does not have a return value
  {
    width=w;
    height=h;
    depth=d;
  }*/
  //returning a value
  double volume()
  {
    return width*height*depth;
  }
}
/*  void display()
  {
    System.out.println("volume is "+(width * height * depth));
  }
}*/
//This class declares an object of type box
class boxdemo
{
  public static void main(String[] args) {
    box mybox = new box();
    //mybox.assign(10,10,9);
    /*
    mybox.width=10;
    mybox.height=10;
    mybox.depth=10;
    */
    mybox.assign();
    double vol= mybox.volume();
    System.out.println(" "+vol);
  }
}
