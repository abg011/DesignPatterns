public class NYStyleCheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public NYStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing pizza...");
        this.dough = pizzaIngredientFactory.createDough();
        System.out.println("Added dough: " + this.dough.getName());
        this.clam = pizzaIngredientFactory.createClam();
        System.out.println("Added clams: " + this.clam.getName());
        this.cheese = pizzaIngredientFactory.createCheese();
        System.out.println("Added cheese: " + this.cheese.getName());
    }
}
