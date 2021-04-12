public class Status {
    private final String start = "Starting to make a coffee";
    private final String grinding = "Grinding coffee beans";
    private final String boiling = "Boiling water";
    private final String mixing = "Mixing boiled water with crushed coffee beans";
    private final String pourCoffee = "Pouring coffee into the cup";
    private final String pourMilk = "Pouring some milk into the cup";
    private final String ready = "Coffee is ready!";


    private static <T> void printStatus(T var) {
        System.out.println(var + "\n");
    }

    public Status() {
    }

    public void makeCoffee() {
        printStatus(start);
        printStatus(grinding);
        printStatus(boiling);
        printStatus(mixing);
        printStatus(pourCoffee);
        printStatus(pourMilk);
        printStatus(ready);
    }
}