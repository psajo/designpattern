package strategy.step5;

public class Squeack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("삑삑");
  }
}
