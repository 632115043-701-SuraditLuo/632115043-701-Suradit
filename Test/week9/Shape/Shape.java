package Test.week9.Shape;

public class Shape {
    int height, width,length;
    
    public Shape(int width, int height) {

        this.height = height;
        this.width = width;
      

	}
    public Shape(int length){
        this.length = length;
    }
    
    public Shape(){

    }

	public String toString(){

        return "This is a shape";
    }
}
