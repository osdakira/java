class Point {
  protected int x = 0;
  protected int y = 0;

  public Point(){}

  public Point(int x, int y){
    this.x = x;
    this.y = y;
  }

  public Point(Point p){
    this.x = p.x;
    this.y = p.y;
  }

  public void add(Point p){
    this.x += p.x;
    this.y += p.y;
  }

  public void render(){
    System.out.println("x=" + this.x + ", y=" + this.y);
  }
}

class Point3D extends Point {
  private int z = 0;

  public Point3D(){}

  public Point3D(int x, int y, int z){
    super(x, y);
    this.z = z;
  }

  public Point3D(Point3D p){
    super(p);
    this.z = p.z;
  }

  public void add(Point3D p){
    super.add(p);
    this.z += p.z;
  }

  public void render(){
    System.out.println("x=" + this.x + ", y=" + this.y + ", z=" + this.z);
  }
}

class Calculator {
  private Point inputPointA = null;
  private Point inputPointB = null;
  private Point resultPoint = null;

  public void setPointA(Point a){
    this.inputPointA = a;
  }

  public void setPointB(Point b){
    this.inputPointB = b;
  }

  public void add(){
    this.resultPoint = new Point(inputPointA);
    this.resultPoint.add(inputPointB);
  }

  public void render(){
    this.resultPoint.render();
  }
}

class Calculator3D extends Calculator{
  protected Point3D inputPointA = null;
  protected Point3D inputPointB = null;
  protected Point3D resultPoint = null;

  public void setPointA(Point3D a){
    this.inputPointA = a;
  }

  public void setPointB(Point3D b){
    this.inputPointB = b;
  }

  public void add(){
    this.resultPoint = new Point3D(inputPointA);
    this.resultPoint.add(inputPointB);
  }
  public void render(){
    this.resultPoint.render();
  }
}

class Test2 {
  public static void main(String args[]){
    // Point point_1 = new Point(1, 2);
    // Point point_2 = new Point(3, 4);

    // Calculator calc = new Calculator();
    // calc.setPointA(point_1);
    // calc.setPointB(point_2);
    // calc.add();
    // calc.render();

    Point3D point_1 = new Point3D(1, 2, 5);
    Point3D point_2 = new Point3D(3, 4, 6);

    Calculator3D calc = new Calculator3D();
    calc.setPointA(point_1);
    calc.setPointB(point_2);
    calc.add();
    calc.render();
  }
}
