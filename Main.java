import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double kilometer, celsius, rupees, dollar;
        int choose;

        System.out.print("Unit Converter\n\n1.Kilometer to Miles\n2.Celsius to Fahrenheit\n3.Rupees to Dollar\n4.Exit\nYour Chose : ");

        if (scanner.hasNextInt()) {
            choose = scanner.nextInt();  // valid integer input
        } else {
            System.out.println("Invalid input! Please enter a number between 1 and 4.");
            scanner.next(); // consume the invalid token
            choose = -1;    // set to invalid choice
        }
        switch (choose) {
            case 1:
                System.out.println("Kilometer to Miles");

                System.out.print("Kilometer : ");
                if (scanner.hasNextDouble()) {
                    kilometer = scanner.nextDouble();
                    System.out.printf(kilometer + " Kilometer means " + kilometer * 0.621371 + " Miles");
                } else {
                    System.out.println("Only Numbers...");
                    kilometer = -1;
                }
                break;
            case 2:

                System.out.println("Celsius to Fahrenheit");
                System.out.print("Celsius : ");
                if (scanner.hasNextDouble()) {
                    celsius = scanner.nextDouble();
                    System.out.printf(celsius + "celsius means " + (celsius * 1.8 + 32) + " Fahrenheit");
                } else {
                    System.out.println("Only Numbers...");
                    scanner.next();
                    celsius = -1;
                }
                break;
            case 3:
                System.out.println("Rupees to Dollar");
                System.out.print("Rupees : ");
                if (scanner.hasNextDouble()) {
                    rupees = scanner.nextDouble();
                    dollar = rupees / 89.90;
                    System.out.printf(rupees + " rupees means $%.3f ",dollar);
                } else {
                    System.out.println("Only Numbers...");
                    scanner.next();
                    rupees = -1;
                }
                break;
            case 4:
                System.out.println("Exiting the program");
                break;
            default:
                System.out.println("Invalid Choose");
                break;
        }
    }
}