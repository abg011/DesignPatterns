public class HouseBlend extends Beverage {

    public HouseBlend(Size size) {
        description = size.toString() + " House Blend";
        setSize(size);
    }

    @Override
    public double cost() {
        Size size = getSize();
        if(size == Size.TALL) return 0.89;
        else if(size == Size.GRANDE) return 0.90;
        else return 0.91;
    }
}
