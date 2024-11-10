int vanillaPrice = 86;      
int chocolatePrice = 40;  
int strawberryPrice = 80;   
int conePrice = 100;       
void iceCreamShop() {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.println("Would you like (v)anilla, (c)hocolate or (s)trawberry?");
    String flavour = scanner.nextLine().toLowerCase();   
    int scoopPrice;
    switch (flavour) {
        case "v":
            scoopPrice = vanillaPrice;
            break;
        case "c":
            scoopPrice = chocolatePrice;
            break;
        case "s":
            scoopPrice = strawberryPrice;
            break;
        default:
            System.out.println("We don't have that flavour.");
            return;
    }
    System.out.println("How many scoops would you like?");
    int scoops = scanner.nextInt();
    
    if (scoops < 1) {
        System.out.println("We don't sell just a cone.");
        return;
    } else if (scoops > 3) {
        System.out.println("That's too many scoops to fit in a cone.");
        return;
    }
    int totalCostInPence = conePrice + (scoopPrice * scoops);
    int pounds = totalCostInPence / 100;
    int pence = totalCostInPence % 100;
    System.out.printf("That will be %d.%02d please.%n", pounds, pence);
}
