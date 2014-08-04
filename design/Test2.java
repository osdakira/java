class Point {
  private int x = 0;
  private int y = 0;

  public Point(){}

  public Point(int x, int y){
    this.x = x;
    this.y = y;
  }

  public void add(Point p){
    this.x += p.x;
    this.y += p.y;
  }

  public void render(){
    System.out.println("x=" + this.x + ", y=" + this.y);
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
    resultPoint = new Point();
    resultPoint.add(inputPointA);
    resultPoint.add(inputPointB);
  }

  public void render(){
    resultPoint.render();
  }
}

class Test2 {
  public static void main(String args[]){
    Point point_1 = new Point(1, 2);
    Point point_2 = new Point(3, 4);

    Calculator calc = new Calculator();
    calc.setPointA(point_1);
    calc.setPointB(point_2);
    calc.add();
    calc.render();
  }
}
