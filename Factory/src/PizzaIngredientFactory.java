import java.util.List;

public abstract class PizzaIngredientFactory {
    public abstract Dough createDough();
    public abstract List<Veggy> createVeggies();
    public abstract Pepperoni createPepperoni();
    public abstract Cheese createCheese();
    public abstract Clam createClam();
}
