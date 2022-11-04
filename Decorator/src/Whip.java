public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        Double decoCost;
        Size bevSize = beverage.getSize();
        if(bevSize == Size.TALL) decoCost = 0.15;
        else if (bevSize == Size.GRANDE) {
            decoCost = 0.16;
        } else {
            decoCost = 0.17;
        }
        return decoCost + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with Whip";
    }
}
