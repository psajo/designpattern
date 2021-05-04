package strategy.step5;

public class MallardDuck extends Duck{

  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  @Override
  void display() {
    System.out.println("Mallard Duck");
  }
}
