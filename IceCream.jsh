// IceCream.jsh (Java version for jshell)
import java.util.Scanner;
public class IceCreamShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        // Example student number, replace with your own last 6 digits
        int studentNumber = 123456;       
        // Price per scoop based on student number
        int vanillaPrice = studentNumber % 100;         // Last 2 digits
        int chocolatePrice = (studentNumber / 100) % 100; // Middle 2 digits
        int strawberryPrice = studentNumber / 10000;     // First 2 digits
        // Available flavours and their prices
        String flavour = "";
        int pricePerScoop = 0;
        // Get flavour choice from user
        System.out.print("Would you like (v)anilla, (c)hocolate or (s)trawberry? ");
        flavour = scanner.nextLine();        
        if (flavour.equals("v")) {
            pricePerScoop = vanillaPrice;
        } else if (flavour.equals("c")) {
            pricePerScoop = chocolatePrice;
        } else if (flavour.equals("s")) {
            pricePerScoop = strawberryPrice;
        } else {
            System.out.println("We don't have that flavour.");
            return;
        }
        // Get number of scoops from user
        System.out.print("How many scoops would you like? ");
        int scoops = scanner.nextInt();       
        if (scoops < 1) {
            System.out.println("We don't sell just a cone.");
            return;
        } else if (scoops > 3) {
            System.out.println("That's too many scoops to fit in a cone.");
            return;
        }
        // Calculate total cost (100 pence for the cone + price per scoop * number of scoops)
        int totalPrice = 100 + pricePerScoop * scoops; // in pence
        System.out.printf("That will be £%.2f please.%n", totalPrice / 100.0);
    }
}
