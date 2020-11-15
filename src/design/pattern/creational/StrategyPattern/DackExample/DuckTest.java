package design.pattern.creational.StrategyPattern.DackExample;

import design.pattern.creational.StrategyPattern.DackExample.Duck.Duck;
import design.pattern.creational.StrategyPattern.DackExample.Duck.MallardDuck;
import design.pattern.creational.StrategyPattern.DackExample.Fly.FlyWithWings;
import design.pattern.creational.StrategyPattern.DackExample.Quake.MuteQuack;

/**
 * @author baihui
 * @create 2020/10/26
 */

public class DuckTest {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        mallard.setFlyBehavior(new FlyWithWings());
        mallard.setQuackBehavior(new MuteQuack());
        mallard.performQuack();
    }
}
