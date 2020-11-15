package design.pattern.creational.StrategyPattern.DackExample.Duck;

import design.pattern.creational.StrategyPattern.DackExample.Fly.FlyBehavior;
import design.pattern.creational.StrategyPattern.DackExample.Quake.QuackBehavior;

/**
 * @author baihui
 * @create 2020/10/26
 */

public abstract class Duck {
    //为行为接口声明两个引用变量
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void performFly() {
        flyBehavior.fly();//委托给行为类
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    //随时调用该方法改变鸭子的行为
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim() {
        System.out.println("All duck float,even decoys");
    }

    public abstract void dispaly();
}
