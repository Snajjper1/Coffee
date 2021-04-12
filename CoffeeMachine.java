import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Status status = new Status();

        status.makeCoffee();

        System.out.println("Please write how many cups of coffee you will need");
        Scanner input = new Scanner(System.in);

        int cups = input.nextInt();

        Ingredients ingredients = new Ingredients();

        ingredients.Calculator(cups);
    }
}
