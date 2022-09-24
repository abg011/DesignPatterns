public class Mallard extends Duck {

    public Mallard() {
        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new NormalQuack());
    }

    @Override
    public void display() {
        System.out.println("I am a mallard");
    }
}
