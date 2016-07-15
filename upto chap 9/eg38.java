//creating a multilevel hierarchy
class box
{
  private double  width;
  private double  height;
  private double  depth;
  box(double w,double h,double d)
  {
    width=w;
    height=h;
    depth=d;
  }
  //using cloning of object to the constructor
  box(box ob)
  {
      width=ob.width;
      height=ob.height;
      depth=ob.depth;
  }
  //default constructor
  box()
  {
    width=-1;
    height=-1;
    depth=-1;
  }
  //for cube all sides are equal
  box(double c)
  {
      width=height=depth=c;
  }
  double volume()
  {
    return width*height*depth;
  }
}
//creating a subclass that gonna inherit box
class boxWeight extends box
{
    double weight;
    //for providing all the given attributes
    boxWeight(double w,double h,double d,double m)
    {
        super(w,h,d);
        weight=m;
    }
    boxWeight(boxWeight ob)
    {
      super(ob);
      weight=ob.weight;
    }
    //default constructor
    boxWeight()
    {
      super();
      weight=-1;
    }
    boxWeight(double c,double m)
    {
        super(c);
        weight=m;
    }
}
class shipment extends boxWeight
{
    double cost;
    shipment(double w,double h,double d,double m,double c)
    {
      super(w,h,d,m);
      cost=c;
    }
    shipment(shipment ob)
    {
      super(ob);
      cost=ob.cost;
    }
    shipment()
    {
      super();
      cost=-1;
    }
    //incase of a cube
    shipment(double l,double m,double c)
    {
      super(l,m);
      cost=c;
    }
}
class demo
{
  public static void main(String[] args) {
    shipment obj= new shipment(10,10,10,10,3);
    double vol=obj.volume();
    System.out.println("Volume of the shipment:"+vol);
    System.out.println("Weight of the shipment:"+obj.weight);
    System.out.println("cost of the shipment:"+obj.cost);

  }
}
