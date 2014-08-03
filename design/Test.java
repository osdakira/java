class PointModel{
  private int x = 0;
  private int y = 0;

  public PointModel(){}

  public PointModel(int x, int y){
    this.x = x;
    this.y = y;
  }

  public int getX(){
    return this.x;
  }

  public void setX(int x){
    this.x = x;
  }

  public int getY(){
    return this.y;
  }

  public void setY(int y){
    this.y = y;
  }
}

class PointController {
  public int add(int a, int b){
    return a + b;
  }

  public PointModel addPoint(PointModel a, PointModel b){
    PointModel addedPoint = new PointModel();
    addedPoint.setX(this.add(a.getX(), b.getX()));
    addedPoint.setY(this.add(a.getY(), b.getY()));
    return addedPoint;
  }
}

class PointView{
  public void print(PointModel point){
    System.out.println("x=" + point.getX() + ", y=" + point.getY());
  }
}

class Test{
  public static void main(String args[]){
    PointModel point_1 = new PointModel(1, 2);
    PointModel point_2 = new PointModel(3, 4);

    PointController controller = new PointController();
    PointModel point_3 = controller.addPoint(point_1, point_2);

    PointView view = new PointView();
    view.print(point_3);
  }
}
