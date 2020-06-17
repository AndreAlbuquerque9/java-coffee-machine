package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CoffeeMachineController coffeeMachineController = new CoffeeMachineController();
        String action;

        System.out.println("\nWrite action (buy, fill, take):");
        action = scanner.nextLine();

        if (action.equals("buy") || action.equals("fill") || action.equals("take")) {

            switch (action) {
                case "buy":
                    coffeeMachineController.buy();
                    break;
                case "fill":
                    coffeeMachineController.fill();
                    break;
                case "take":
                    coffeeMachineController.take();
                    break;
                default:
                    break;
            }
            coffeeMachineController.printStatus();
        } else {
            System.out.println("Please, make sure you write the right action.");
        }

    }
}
