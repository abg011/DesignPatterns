import java.util.ArrayList;
import java.util.List;

public class NYIngredientFactory extends PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public List<Veggy> createVeggies() {
        List<Veggy> veggies = new ArrayList<>();
        veggies.add(new Onion());
        veggies.add(new Tomato());
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new NYPepperoni();
    }

    @Override
    public Cheese createCheese() {
        return new Mozarella();
    }

    @Override
    public Clam createClam() {
        return new FrozenClam();
    }
}
