package strategy.step5;

public class FlyNoWay implements FlyBehavior{

  @Override
  public void fly() {
    System.out.println("날지 못합니다");
  }
}