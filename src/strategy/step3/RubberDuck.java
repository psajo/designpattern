package strategy.step3;

public class RubberDuck extends Duck{

  @Override
  void quack() {
    System.out.println("삑삑");
  }

  @Override
  void display() {
    System.out.println("Rubber Duck");
  }

  @Override
  void fly() {
    System.out.println("날지 못합니다");
  }
}
