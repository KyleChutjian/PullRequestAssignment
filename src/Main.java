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

        System.out.println("Now, what is your favorite number?");
        int number = IO.nextInt();
        if (number == 7 || number == 11 || number == 25) {
            System.out.println(number + " is a great number, 10/10");
        } else if (number == 3 || number == 13 || number == 9) {
            System.out.println(number + " is an okay number, 7/10");
        } else {
            System.out.println("That is not a good number, 0/10");
        }

        System.out.println("What is your favorite season?");
        String season = IO.next();
        season = IO.nextLine();

        if (season.equalsIgnoreCase("fall") || season.equalsIgnoreCase("autumn")) {
            System.out.println("Fall is the best season, 10/10");
        } else if (season.equalsIgnoreCase("summer")) {
            System.out.println("Summer is a close second, 9/10");
        } else {
            System.out.println("You didnt say fall or summer, and both winter or spring are equally ok, 5/10");
        }

    }

}
