package Test.week7;

public class bicycle {
    public int speed;
    public int gear;
    public bicycle(){
        System.out.println("Input the current speed");
        gear = 1;
    }
    public bicycle(int speed){
        this.speed = speed;
    }
    public void brake(){
        speed -= 5;
        if(speed <= 0){
            speed = 0;
            System.out.println("Your bicycle has stopped");
        }
    }
    public void accelerate (){
        speed += 5*gear;
    }
    public void checkSpeed(){
        System.out.println("The current speed is " + speed);
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
}
