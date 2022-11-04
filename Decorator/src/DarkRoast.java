public class DarkRoast extends Beverage {

    public DarkRoast(Size size) {
        description = size.toString() + " Dark Roast";
        setSize(size);
    }

    @Override
    public double cost() {
        Size size = getSize();
        if(size == Size.TALL) return 0.95;
        else if(size == Size.GRANDE) return 0.96;
        else return 0.97;
    }
}
