package strategy.step5;

abstract public class Duck {
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  void performQuack(){
    quackBehavior.quack();
  }
  void performFly() {
    flyBehavior.fly();
  }
  void swim() {
    System.out.println("헤엄칩니다");
  }
  abstract void display();

  void setFlyBehavior(FlyBehavior fb){
    flyBehavior = fb;
  }
  void setQuackBehavior(QuackBehavior qb) {
    quackBehavior = qb;
  }
}
