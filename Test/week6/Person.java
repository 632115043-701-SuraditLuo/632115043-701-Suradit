package Test.week6;

public class Person {
    String name;
    int age;
    char gender;
    public Person(){

    }
    public Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce(){
        System.out.println("My name is " + name + " I'm " + age + " years old and my gender is " + gender);
    }
}
