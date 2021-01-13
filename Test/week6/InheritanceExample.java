package Test.week6;

public class InheritanceExample {
    public static void main(String[] args) {
        Artist art = new Artist("Ball", 20, 'M');

        art.genre = "hip hop";
        art.introduce();
        art.playMusic();

        SoftwareEngineer se = new SoftwareEngineer("Leng", 19, 'M');

        se.language = "Java";
        se.introduce();
        se.coding();

        Doctor doc = new Doctor("Anna", 32, 'F');

        doc.organ = "heart";
        doc.introduce();
        doc.surgery();

        Fisherman fisher = new Fisherman("Peter", 44, 'M');

        fisher.fish = "salmon";
        fisher.introduce();
        fisher.fishing();

        Chef chef = new Chef("Hersha", 35, 'F');
        chef.food = "pizza";
        chef.introduce();
        chef.cook();
    }
    
}
