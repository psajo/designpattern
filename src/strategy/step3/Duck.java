package strategy.step3;

abstract public class Duck {
  void quack(){
    System.out.println("꽥꽥");
  }
  void swim() {
    System.out.println("헤엄칩니다");
  }
  abstract void display();
  void fly() {
    System.out.println("날아갑니다");
  }
}
