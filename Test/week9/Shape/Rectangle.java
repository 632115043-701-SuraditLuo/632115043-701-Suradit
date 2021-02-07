package Test.week9.Shape;

public class Rectangle extends Shape{
    public Rectangle(int width,int height){

        super(width,height);
    }
    public Rectangle(int length){
        super(length);
    }

public String toString(){

    return "This is a rectangle with width as "+ width +" and height as " + height;
}
    
}
