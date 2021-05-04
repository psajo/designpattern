package strategy.step4;

public class RedheadDuck extends Duck implements Flyable,Quackable{

  @Override
  void display() {
    System.out.println("Redhead Duck");
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
