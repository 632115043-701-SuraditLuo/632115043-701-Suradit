package Test.week7;

public class pet {
    String pet;
    String name;
    int age;
    String color;
    String species;
    char size;
    public pet(){

    }
    public pet(String name, String species, String color, int age){
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }
    
    public void showData(){
        System.out.println("My " + pet + " name is " + name + " Species: " + species + " Color: " + color + " age: " + age);
    }
    
}
