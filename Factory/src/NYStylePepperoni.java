import java.util.ArrayList;
import java.util.List;

public class NYStylePepperoni extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public NYStylePepperoni(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing pizza...");
        this.dough = pizzaIngredientFactory.createDough();
        System.out.println("Added dough: " + this.dough.getName());
        this.pepperoni = pizzaIngredientFactory.createPepperoni();
        System.out.println("Added pepperoni: " + this.pepperoni.getName());
        this.sauce = pizzaIngredientFactory.createSauce();
        System.out.println("Added sauce: " + this.sauce.getName());
    }
}
