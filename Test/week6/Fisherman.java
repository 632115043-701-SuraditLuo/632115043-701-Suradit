package Test.week6;

public class Fisherman extends Person{

    String fish;
    public Fisherman(String name,int age, char gender){
        this.name= name;
        this.age = age;
        this.gender = gender;
    }

    public void fishing(){
        System.out.println( name + " catch " + fish );
    }
    
}
