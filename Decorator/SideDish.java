public abstract class SideDish implements Meal {

    private Meal meal;

    public SideDish(Meal meal) {
        this.meal = meal;
    }

    @Override
    public double getPrice() {
        return this.meal.getPrice();
    }

    @Override
    public void printMeal() {
        this.meal.printMeal();
    }
}
