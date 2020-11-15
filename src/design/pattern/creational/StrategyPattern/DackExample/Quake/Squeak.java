package design.pattern.creational.StrategyPattern.DackExample.Quake;

/**
 * @author baihui
 * @create 2020/10/26
 */

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
