package strategy.step3;

public class DecoyDuck extends Duck{

  @Override
  void quack() {
    System.out.println("못 웁니다");
  }

  @Override
  void swim() {
    System.out.println("헤엄치지 못합니다");
  }

  @Override
  void fly() {
    System.out.println("날지 못합니다");
  }

  @Override
  void display() {
    System.out.println("Decoy Duck");
  }
}
