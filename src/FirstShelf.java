public class FirstShelf {
    public static void main(String[] args) {
        Fridge apple = new Fridge("Apple", false, true, "next week", 100);
        Fridge cabbage = new Fridge("Cabbage", true, false, "tomorrow", 400);
        Fridge chocolate = new Fridge("Chocolate", false, false, "next year", 100);

        System.out.println("Product: "+ apple.name);
        System.out.println("Fruit? " + apple.fruit);
        System.out.println("Expiry date: " + apple.expiryDate);
        System.out.println("Weight: " + apple.weight + "g");

        System.out.println("Product: "+ cabbage.name);
        System.out.println("Vegatable? " + cabbage.vegetable);
        System.out.println("Expiry date: " + cabbage.expiryDate);
        System.out.println("Weight: " + cabbage.weight + "g");

        System.out.println("Product: "+ chocolate.name);
        System.out.println("Fruit? " + chocolate.fruit);
        System.out.println("Vegatable? " + cabbage.vegetable);
        System.out.println("Expiry date: " + chocolate.expiryDate);
        System.out.println("Weight: " + chocolate.weight + "g");
        

    }
}
