public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        Double decoCost;
        Size bevSize = beverage.getSize();
        if(bevSize == Size.TALL) decoCost = 0.20;
        else if (bevSize == Size.GRANDE) {
            decoCost = 0.21;
        } else {
            decoCost = 0.22;
        }
        return decoCost + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with Mocha";
    }
}
