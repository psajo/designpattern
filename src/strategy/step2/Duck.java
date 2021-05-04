package strategy.step2;

abstract public class Duck {
  void quack() {
    System.out.println("꽥꽥");
  }
  void swin() {
    System.out.println("헤엄칩니다");
  }
  abstract void display();

  void fly() {
    System.out.println("날아갑니다");
  }
}
