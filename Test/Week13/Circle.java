package Test.Week13;

public class Circle extends Shape {
    private static double PI = 3.14;
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public double getArea(){
        return PI*(radius*radius);
    }


}
