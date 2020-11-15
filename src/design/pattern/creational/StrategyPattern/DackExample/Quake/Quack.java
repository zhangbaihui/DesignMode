package design.pattern.creational.StrategyPattern.DackExample.Quake;

/**
 * @author baihui
 * @create 2020/10/26
 */

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
