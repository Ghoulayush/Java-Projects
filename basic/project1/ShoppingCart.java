import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args) {

        // SHOPPING CART PROGRAM
        Scanner sc = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = sc.nextLine();

        System.out.print("What is the price for each?: ");
        price = sc.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = sc.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item +"/s");
        System.out.println("Your total is " + currency + total);

        sc.close();
    }
}