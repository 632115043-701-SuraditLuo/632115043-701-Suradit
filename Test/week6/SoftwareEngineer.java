package Test.week6;

public class SoftwareEngineer extends Person {
    String language;
    
    public SoftwareEngineer(String name, int age, char gender){
    this.name = name;
    this.age = age;
    this.gender = gender;


}
    public void coding(){
        System.out.println(name + " is coding " + language + " language." );
    }
}
