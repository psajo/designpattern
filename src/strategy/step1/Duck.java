package strategy.step1;

abstract public class Duck {
  void quack(){
    System.out.println("꽥꽥");
  }
  void swim() {
    System.out.println("헤엄칩니다");
  }
  abstract void display();
}
