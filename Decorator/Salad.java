public class Salad extends SideDish {

    private double price;

    public Salad(Meal meal, double price) {
        super(meal);
        this.price = price;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + this.price;
    }

    @Override
    public void printMeal() {
        super.printMeal();
        System.out.println("Salad: " + this.price);
    }
}
