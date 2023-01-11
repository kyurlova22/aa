public class Main {

    public static void main(String[] args) {

        // Make an order
        Meal meal = new Salad(new Chips(new Steak(20.0), 3.5), 5.0);

        // Print order and total price
        meal.printMeal();
        System.out.println("Total price: " + meal.getPrice());
    }
}
