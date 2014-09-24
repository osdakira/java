class A{
  public static void a(){
    System.out.println("class method");
  }
  public static void main(String args[]){
    A.a();
    A a = new A();
    a.a(); // instance can call classmethod
  }
}
