// Concrete implementation of Beverage class
public class Espresso extends Beverage {

    public Espresso(Size size) {
        description = size.toString() + " Espresso";
        setSize(size);
    }

    @Override
    public double cost() {
        Size size = getSize();
        if(size == Size.TALL) return 1.99;
        else if(size == Size.GRANDE) return 2.00;
        else return 2.01;
    }
}
