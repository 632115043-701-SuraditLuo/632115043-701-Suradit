package Test.week9;

public class FootballPlayer extends Person{
    String workState;

    public FootballPlayer(String name, int bornYear, String workState){
            super(name, bornYear);
            this.workState = workState;
    }

    public void introduce() {
        super.introduce();
        System.out.println("I'm a football player and work in " + workState + ".");
    }
    
}
