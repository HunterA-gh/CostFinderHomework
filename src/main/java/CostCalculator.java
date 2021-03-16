import java.util.Scanner;

public class CostCalculator {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Hello, what are you buying?: ");
        String product = userInput.nextLine();
        System.out.println();

        System.out.print("What is price of your product?: $");
        double price = userInput.nextDouble();
        System.out.println();

        System.out.print("How many are you buying?: ");
        int quantity = userInput.nextInt();
        System.out.println();

        System.out.print("What distance are you in miles?: ");
        double miles = userInput.nextDouble();
        System.out.println();

        int fee;
        if(miles < 5){
            fee = 2;
        } else if(miles < 15){
            fee = 5;
        } else if(miles < 25){
            fee = 10;
        } else if(miles < 50){
            fee = 15;
        } else{
            fee = 20;
        }

        double total = price * quantity + fee;

        String sPrice = String.valueOf(price);
        String sMiles = String.valueOf(miles);
        String sTotal = String.valueOf(total);


        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n","Product","Qty","Price","Miles","Total");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n","---","---","-----","-----","----");
        System.out.printf("%-10s%-10d%-10s%-10s%-10s",product, quantity, sPrice, sMiles, sTotal);
        System.out.println();
        System.out.println();
        System.out.print("        THANK YOU FOR SHOPPING WITH US!");



    }
}
