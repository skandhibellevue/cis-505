import java.util.Scanner;

public class TestBowlingShopApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Bowling Shop");
        System.out.println("\n");

        char code = '\0';
        // Create instance of Scanner class
        Scanner scanner = new Scanner(System.in);

        do {
            // Displays menu
            TestBowlingShopApp.displayMenu();
            code = Character.toLowerCase(scanner.next().charAt(0)); // read user input for code
            if (code == 'x') { continue; }

            // get products for the respective code
            GenericQueue<Product> products = ProductDB.getProducts(String.valueOf(code));

            System.out.println("\n--Product Listing--");
            // while loop to keep track of products in the generic queue
            while(products.getSize() > 0) {
                Product product = products.dequeue();
                System.out.println(product.toString() + "\n"); // prints product details to the console
            }
            System.out.println("\n");
        } while (code != 'x');

        System.out.println("End of line...");
    } // end main

    /**
     * DisplayMenu method, which is used to display available menu options.
     * @return void
     */
    public static void displayMenu() {
        System.out.println("MENU OPTIONS");
        System.out.println("1. <b> Bowling Balls");
        System.out.println("2. <a> Bowling Bags");
        System.out.println("3. <s> Bowling Shoes");
        System.out.println("4. <x> To exit\n");
        System.out.print("Please choose an option: ");
    } // end displayMenu
} // end TestBowlingShopApp
