public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        Double decoCost;
        Size bevSize = beverage.getSize();
        if(bevSize == Size.TALL) decoCost = 0.18;
        else if (bevSize == Size.GRANDE) {
            decoCost = 0.19;
        } else {
            decoCost = 0.20;
        }
        return decoCost + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with Soy";
    }
}
