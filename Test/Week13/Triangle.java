package Test.Week13;

public class Triangle extends Shape{
    private double height, base;
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double getArea(){
        return 0.5*base*height;
    }
    
}
