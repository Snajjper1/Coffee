import java.util.Scanner;

public class Ingredients {

    private final byte milkForOneCup = 50;
    private final byte coffeeBeansForOneCup = 15;
    private final int waterForOneCup = 200;

    private double milk = 1000;
    private double coffeeBeans = 1000;
    private double water = 1500;


    public void Calculator(int cups){
        System.out.println("Please write how many cups of coffee you will need");
        int water = waterForOneCup * cups;
        int milk = milkForOneCup * cups;
        int coffeeBeans = coffeeBeansForOneCup * cups;
        System.out.printf("For %d cups of coffee you wil need: \n", cups);
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
    }
}
