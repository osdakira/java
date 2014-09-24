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

  public int getX(){
    return this.x;
  }

  public int getY(){
    return this.y;
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

  public int getZ(){
    return this.z;
  }
}

class Calculator {
  public Point add(Point a, Point b){
    Point resultPoint = new Point(a);
    resultPoint.add(b);
    return resultPoint;
  }

  public Point3D add(Point3D a, Point3D b){
    Point3D resultPoint = new Point3D(a);
    resultPoint.add(b);
    return resultPoint;
  }
}

class Renderer {
  public void render(Point p){
    System.out.println("x=" + p.getX() + ", y=" + p.getY());
  }

  public void render(Point3D p){
    System.out.println("x=" + p.getX() + ", y=" + p.getY() + ", z=" + p.getZ());
  }
}

class Test2 {
  public static void main(String args[]){
    // Point point_1 = new Point(1, 2);
    // Point point_2 = new Point(3, 4);

    // Calculator calc = new Calculator();
    // Point resultPoint = calc.add(point_1, point_2);

    // Renderer renderer = new Renderer();
    // renderer.render(resultPoint);

    Point3D point_1 = new Point3D(1, 2, 5);
    Point3D point_2 = new Point3D(3, 4, 6);

    Calculator3D calc = new Calculator3D();
    Point3D resultPoint = calc.add(point_1, point_2);

    Renderer renderer = new Renderer();
    renderer.render(resultPoint);
  }
}
