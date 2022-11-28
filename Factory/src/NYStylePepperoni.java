public class NYStylePepperoni extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public NYStylePepperoni(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {

    }
}
