public class Main {
    public static void main(String[] args) {
        Duck dukc = new Mallard();
        dukc.display();
        dukc.performFly();
        dukc.performQuack();

        dukc.setFlyBehaviour(new FlyWithBeer());
        dukc.setQuackBehaviour(new SqueakyQuack());

        dukc.display();
        dukc.performFly();
        dukc.performQuack();
    }
}
