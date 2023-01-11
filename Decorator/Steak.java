public class Steak implements Meal {

    private double price;

    public Steak(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void printMeal() {
        System.out.println("Steak: " + this.price);
    }
}
