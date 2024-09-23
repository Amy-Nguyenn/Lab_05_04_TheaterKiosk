import java.util.Scanner;

public class TheaterKiosk {

    public static void main(String[] args) {
        // start TheaterKiosk

        // import java.util.Scanner

        // main method
        Scanner in = new Scanner(System.in); // create scanner object for user input
        int age; // declare age variable

        System.out.print("Enter your age: "); // ask for user input


        if (in.hasNextInt()) {
            age = in.nextInt(); // read  age
            in.nextLine();

            // check if the age is 21 or older
            if (age >= 21) {
                System.out.println("You get a paper wrist band.");
            }
        } else {

        }

        // close scanner
        in.close(); // close scanner
        // end TheaterKiosk
    }
}