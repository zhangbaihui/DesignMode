package design.pattern.creational.StrategyPattern.DackExample.Duck;

import design.pattern.creational.StrategyPattern.DackExample.Fly.FlyWithWings;
import design.pattern.creational.StrategyPattern.DackExample.Quake.Quack;

/**
 * @author baihui
 * @create 2020/10/26
 */


/**
 * MallardDuck构造器将quackBehavior实例变量 初始化成Quack类型的新实例
 * 将flyBehavior实例变量初始化成FlyWithWings 类型的实例
 */
public class MallardDuck extends Duck{

    public MallardDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior =new Quack();
    }

    @Override
    public void dispaly() {
        System.out.println("I'm a real MallardDuck!");
    }
}
