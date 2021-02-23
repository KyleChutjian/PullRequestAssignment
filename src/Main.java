import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner IO = new Scanner(System.in);
        System.out.println("This program judges your opinions, dont have bad ones");

        System.out.println("What is your name?");
        String name = IO.nextLine();
        if (name.equalsIgnoreCase("kyle")) {
            System.out.println("You have the best name, 10/10");
        } else if (name.equalsIgnoreCase("alex")) {
            System.out.println("Your name is a 10/10, I'll accept a 100% as a thank you");
        } else {
            System.out.println("You need a new name, 0/10");
        }

    }

}
