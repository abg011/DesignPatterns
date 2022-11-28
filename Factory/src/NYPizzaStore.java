public class NYPizzaStore extends Pizzastore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        PizzaIngredientFactory pizzaIngredientFactory = new NYIngredientFactory();

        switch (type) {
            case "cheese":
                pizza = new NYStyleCheesePizza(pizzaIngredientFactory);
                break;

            case "pepperoni":
                pizza = new NYStylePepperoni(pizzaIngredientFactory);
                break;

            default:
                pizza = null;
                break;
        }

        return pizza;
    }
}
