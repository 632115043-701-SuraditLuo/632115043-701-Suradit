package Test.week7;

public class bird extends pet{
    String country;
    String fly;
    public bird(String name, String species, String color, int age, String country, String fly){
        this.pet = "bird";
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
        this.country = country;
        this.fly = fly;
    }

        public void speak(){
            System.out.println(name + " can say peek a boo!");
        }
        public void checkCountry(){
            if(country.equals("town")){
            System.out.println("Country: false");}
            else{System.out.println("Country: true");}
        }
        public void isFly(){
            if(fly.equals("can fly")){
            System.out.println("can fly: true");}
            else{System.out.println("can fly: false");}
        }
}
