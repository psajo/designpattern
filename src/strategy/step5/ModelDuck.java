package strategy.step5;

public class ModelDuck extends Duck{

  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }

  @Override
  void display() {
    System.out.println("Model Duck");
  }
}
