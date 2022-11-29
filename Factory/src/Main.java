public class Main {
    public static void main(String[] args) {
        Pizzastore pizzastore = new NYPizzaStore();
        Pizza pizza1 = pizzastore.orderPizza("cheese");
        System.out.println(pizza1.toString() + "\n");

        Pizza pizza2 = pizzastore.orderPizza("pepperoni");
        System.out.println(pizza2.toString() + "\n");
    }
}
