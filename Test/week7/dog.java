package Test.week7;
    
public class dog extends pet{
    String hair;
    public dog(String name, String species, String color, int age, char size, String hair){
        this.pet = "dog";
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
        this.hair = hair;
        this.size = size;

    }
    public void run(){
        System.out.println("My dog " + name + " is running around in the playground");
    }
    public void bark(){
        if(size == 'L'){
            System.out.println("He barks woof woof");
        }else {System.out.println("He bark box box");}
    }
    public void isShort(){
        if(hair.equals("long")){
            System.out.println("Is short: false");
        }else{System.out.println("Is short: True");}
    }
}
