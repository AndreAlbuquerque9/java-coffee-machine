package machine;

public class Coffee {

    final private int waterNeeded;
    final private int milkNeeded;
    final private int coffeeBeansNeeded;
    final private int price;

    public Coffee(int waterNeeded, int milkNeeded, int coffeeBeansNeeded, int price) {
        this.waterNeeded = waterNeeded;
        this.milkNeeded = milkNeeded;
        this.coffeeBeansNeeded = coffeeBeansNeeded;
        this.price = price;
    }

    public int getWaterNeeded() {
        return waterNeeded;
    }

    public int getMilkNeeded() {
        return milkNeeded;
    }

    public int getCoffeeBeansNeeded() {
        return coffeeBeansNeeded;
    }

    public int getPrice() {
        return price;
    }
}