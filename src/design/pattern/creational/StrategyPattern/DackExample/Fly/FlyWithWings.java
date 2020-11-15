package design.pattern.creational.StrategyPattern.DackExample.Fly;


//这是飞行行为的实现，给“真会”飞的鸭子用
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
