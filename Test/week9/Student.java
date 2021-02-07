package Test.week9;

public class Student {
    private String firstName = "Hello";
    private String lastName = "World";

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString(){
        return "My name is " + firstName + " last name " + lastName ;
    }

    public static void main(String[] args) {
        Student p = new Student("Suradit","Luo");
        System.out.println(p.toString());
    }
    
}
