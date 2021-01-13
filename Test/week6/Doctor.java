package Test.week6;

public class Doctor extends Person {
    String organ;

    public Doctor(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void surgery(){
        System.out.println(name + " is doing " + organ + " surgery.");
    }
    
}
