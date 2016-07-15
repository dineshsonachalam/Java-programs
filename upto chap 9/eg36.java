class box
{
  private double width,height,depth;
  box(double w,double h,double d)
  {
      width=w;
      height=h;
      depth=d;
  }
  //construct a clone of object
  box(box ob)
  {
    width = ob.width;
    height = ob.height;
    depth = ob.depth;
  }
  //constructor when no dimensions specified
  box()
  {
    width=-1;
    height=-1;
    depth=-1;
  }
  box(double len) {
    width = height = depth = len;
                  }
  double volume()
  {
    return width*height*depth;
  }
}
class boxWeight extends box
{
    double weight;
    boxWeight(boxWeight ob)
    {
      super(ob);
      weight=ob.weight;
        //pass object to the constructor
    }
    boxWeight(double w,double h,double d,double m)
    {
        super(w,h,d);//class supbclass constructor that is box();
        weight=m;
    }
    boxWeight()
    {
      super();
      weight =-1;//default constructor
    }
    //constructor when cube is called
    boxWeight(double len,double m)
    {
        super(len);
        weight=m;
    }
}
class demo
{
  public static void main(String[] args) {
    boxWeight o =new boxWeight(10,10,10,59);
    boxWeight mybox2 = new boxWeight(2, 3, 4, 0.076);
    boxWeight mybox3 = new boxWeight(); // default
    boxWeight mycube = new boxWeight(3, 2);
    boxWeight myclone = new boxWeight(o);
    System.out.println("Box weight is:"+o.weight);
    System.out.println("volume of the box:"+(o.volume()));
    double vol;
    vol=o.volume();
    System.out.println("volume of mybox1 is:"+vol);
    System.out.println("Weight of mybox1 is:"+o.weight);
    vol=mybox2.volume();
    System.out.println("volume of mybox2 is:"+vol);
    System.out.println("Weight of mybox2 is:"+mybox2.weight);
    vol=mybox3.volume();
    System.out.println("volume of mybox3 is:"+vol);
    System.out.println("Weight of mybox3 is:"+mybox3.weight);
    vol=mycube.volume();
    System.out.println("volume of mycube is:"+vol);
    System.out.println("Weight of mycube is:"+mycube.weight);
    vol=myclone.volume();
    System.out.println("volume of myclone is:"+vol);
    System.out.println("Weight of myclone is:"+mycube.weight);


  }
}
