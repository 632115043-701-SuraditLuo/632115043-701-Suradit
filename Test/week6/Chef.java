package Test.week6;

public class Chef extends Person{
    String food;
    public Chef(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public void cook(){
        System.out.println(name + " is cooking " + food);
    }
}
