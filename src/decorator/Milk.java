package decorator;

public class Milk extends CondimentDecorator{
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost()+1000;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", 우유";
    }
}
