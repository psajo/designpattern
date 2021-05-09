package decorator;

public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost()+500;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", 모카";
    }
}
