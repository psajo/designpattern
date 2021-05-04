package strategy.step4;

public class MallardDuck extends Duck implements Flyable,Quackable{

  @Override
  void display() {
    System.out.println("Mallard Duck");
  }

  @Override
  public void fly() {
    System.out.println("날아갑니다");
  }

  @Override
  public void quack() {
    System.out.println("꽥꽥");
  }
}
