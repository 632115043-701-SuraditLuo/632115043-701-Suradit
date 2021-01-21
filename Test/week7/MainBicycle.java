package Test.week7;
import java.util.Scanner;
public class MainBicycle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        bicycle bike = new bicycle();
        bike.setSpeed(input.nextInt());
        bike.brake();
        bike.accelerate();
        bike.accelerate();
        bike.checkSpeed();

        MountainBike mbike = new MountainBike();
        mbike.setSpeed(input.nextInt());
        System.out.println("Input the gear");
        mbike.setGear(input.nextInt());
        mbike.brake();
        mbike.brake();
        mbike.accelerate();
        mbike.checkSpeed();
        input.close();
    }
}
