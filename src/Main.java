public class Main {
    public static void main(String[] args) {
        int milkAmount = 200; // ml
        int powderAmount = 301; // g
        int eggsCount = 4; // items
        int sugarAmount = 5; // g
        int oilAmount = 30; // ml
        int appleCount = 4; // items
        //hello123
        // Example
        // apples - 5

        if (appleCount >= 5) {
        System.out.println("Apple juice");
        } else {
        System.out.println("Недостаточно ингредиентов для Apple juice");
        }

        /*
        boolean AppleJuiceEnough = true;
        String message = AppleJuiceEnough? ""
        */

        /*
        powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        System.out.println("Pancakes");
        */

        if (powderAmount >=400 && sugarAmount >=10 &&
        milkAmount >=100 && oilAmount >=30) {
            System.out.println("Pancakes");
        } else {
            System.out.println("Недостаточно ингредиентов для Pancakes");
        }

        /*
        milk - 300 ml, powder - 5 g, eggs - 5
        System.out.println("Omelette");
        */

        if (milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5) {
        System.out.println("Omelette");
        } else {
            System.out.println("Недостаточно ингредиентов для Omelette");
        }

        /*
        apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        System.out.println("Apple pie");
        */

        if (appleCount >= 3 && milkAmount >= 100 &&
        powderAmount >= 300 && eggsCount >= 4) {
        System.out.println("Apple pie");
        } else {
            System.out.println("Недостаточно ингредиентов для Apple pie");
        }
    }
}


