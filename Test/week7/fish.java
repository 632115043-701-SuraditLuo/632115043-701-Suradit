package Test.week7;

public class fish extends pet{
    private String address;
    private int speed;
    public fish(String name,String species, String color, int age, String address, int speed, char size){
        this.pet = "fish";
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
        this.address = address;
        this.speed = speed;
        this.size = size;
        
    }
    public void isSea(){
        if(this.address.equals("sea")){
           System.out.println("Is sea fish: true");
        }else{System.out.println("Is sea fish: false");}

    }

    public void swim(){
        if(this.size == 'L'){
        System.out.println ("This big boy swims at " + speed +" km/hr");}
        else{System.out.println("My fish swims at " + speed +" km/hr");}
    }
    public void isFast(){
        if(this.speed >= 50){
            System.out.println("Is fast: true");
        }else{System.out.println("Is fast: false");}
    }   
    
}
