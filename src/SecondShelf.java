public class SecondShelf {
    public static void main(String[] args) {
        Fridge cucumber = new Fridge("Cucumber", true,  false, "next Friday", 200);
        Fridge mango = new Fridge("Mango", false, true, "apparently yesterday", 250);

        System.out.println("Product: "+ cucumber.name);
        System.out.println("Vegetable? " + cucumber.vegetable);
        System.out.println("Expiry date: " + cucumber.expiryDate);
        System.out.println("Weight: " + cucumber.weight + 'g');

        System.out.println("Product: "+ mango.name);
        System.out.println("Fruit? " + mango.fruit);
        System.out.println("Expiry date: " + mango.expiryDate);
        System.out.println("Weight: " + mango.weight + 'g');
    }

}
