public class NYPizzaStore extends Pizzastore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        PizzaIngredientFactory pizzaIngredientFactory = new NYIngredientFactory();

        switch (type) {
            case "cheese":
                pizza = new NYStyleCheesePizza(pizzaIngredientFactory);
                pizza.setName("New York Style Extra Cheese Pizza");
                break;

            case "pepperoni":
                pizza = new NYStylePepperoni(pizzaIngredientFactory);
                pizza.setName("New York Spicy Pepperoni Pizza");
                break;

            default:
                pizza = null;
                break;
        }

        return pizza;
    }
}
