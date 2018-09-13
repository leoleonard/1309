public class SecondShelf {
    //Stwórz drugą klasę, zdefiniuj w niej metodę main i utwórz dwa obiekty utworzonego wcześniej typu
    public static void main(String[] args) {
        Fridge cucumber = new Fridge();
        cucumber.name = "Cucumber";
        cucumber.vegetable = true;
        cucumber.expiryDate = "next Friday";
        cucumber.weight = 200;

        Fridge mango = new Fridge();
        mango.name = "Mango";
        mango.fruit = true;
        mango.expiryDate = "apparently yesterday";
        mango.weight = 250;

        System.out.println("Product: " + cucumber.name);
        System.out.println("Vegatable?: " + cucumber.vegetable);
        System.out.println("Expiry date: " + cucumber.expiryDate);
        System.out.println("Weight: " + cucumber.weight + 'g');

        System.out.println("Product: " + cucumber.name);
        System.out.println("Vegatable?: " + cucumber.vegetable);
        System.out.println("Expiry date: " + cucumber.expiryDate);
        System.out.println("Weight: " + cucumber.weight + 'g');

        System.out.println("Product: " + mango.name);
        System.out.println("Vegatable?: " + mango.vegetable);
        System.out.println("Expiry date: " + mango.expiryDate);
        System.out.println("Weight: " + mango.weight + 'g');
    }

}
