public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggy[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clam;


    public abstract void prepare();
    public void cut() {
        System.out.println("Cutting the pizza into 6 pieces.");
    }

    public void box() {
        System.out.println("Boxing up the pizza");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return null;
    }
}
