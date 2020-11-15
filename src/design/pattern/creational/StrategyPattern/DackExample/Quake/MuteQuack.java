package design.pattern.creational.StrategyPattern.DackExample.Quake;

/**
 * @author baihui
 * @create 2020/10/26
 */

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
