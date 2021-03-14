package Test.Week13;

public class Cube extends Shape{
    private double length;
    public Cube(int length){
        this.length = length;
    }
    public double getArea(){
        return length*length*length;
    }
}
