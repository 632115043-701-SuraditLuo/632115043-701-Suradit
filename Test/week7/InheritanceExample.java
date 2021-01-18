package Test.week7;

public class InheritanceExample {
    public static void main(String[] args) {
    fish nemo = new fish("Megalodon", "nemo", "red", 2, "sea", 24,'S');
    nemo.showData(); 
    nemo.isSea();
    nemo.swim();
    nemo.isFast();
    System.out.println("\n");

    dog bobo = new dog("Bobo", "golden retriever", "blond", 8, 'L', "long");
    bobo.showData();
    bobo.run();
    bobo.bark();
    bobo.isShort();
    System.out.println("\n");
    bird raphael = new bird("Raphael", "Parrot", "Blue", 3, "country", "can fly");
    raphael.showData();
    raphael.speak();
    raphael.isFly();
    raphael.checkCountry();
    System.out.println("\n");

    }
    
}
