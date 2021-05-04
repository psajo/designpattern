package strategy.step4;

public class RubberDuck extends Duck implements Quackable {

  @Override
  void display() {
    System.out.println("Rubber Duck");
  }

  @Override
  public void quack() {
    System.out.println("삑삑");
  }
}
