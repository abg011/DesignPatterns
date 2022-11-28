public abstract class Pizzastore {
    public abstract Pizza createPizza(String type);

    public void orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.cut();
        pizza.box();
    }
}
