package Test.Week13;

public class MainShape {
    public static void main(String[] args) {
        
    
    Triangle tri = new Triangle(4, 8);
    Circle cir = new Circle(3);
    Cube cubic = new Cube(4);

    System.out.println(tri.getArea());
    System.out.println(cir.getArea());
    System.out.println(cubic.getArea());
    }
}
