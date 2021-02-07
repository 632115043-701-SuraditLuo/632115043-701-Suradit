package Test.week9;

public class Cashier extends Person{
    String workState;

    public Cashier(String name, int bornYear, String workState){
            super(name, bornYear);
            this.workState = workState;
    }

    public void introduce() {
        super.introduce();
        System.out.println("I'm a cashier and work in " + workState + ".");
    }
}
