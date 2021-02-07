package Test.week9.Shape;

public class TestOverride {
    public static void main(String[] args) {
        Shape shape1, shape2, shape3;
        shape1 = new Shape();
        shape2 = new Rectangle(8, 12);
        shape3 = new Cube(9);

        System.out.println(shape1.toString());
        System.out.println(shape2.toString());
        System.out.println(shape3.toString());
    }
    

}
