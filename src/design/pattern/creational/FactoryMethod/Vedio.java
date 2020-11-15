package design.pattern.creational.FactoryMethod;

/**
 * @author baihui
 * @create 2020/11/1
 */

/*

 */
public abstract class Vedio {
    //生产视频方法
    public abstract void produce();
}

//相同的类型的产品 称之为产品等级
/*
* 产品等级
* 产品族
* 电冰箱：海信，海尔，格力  产品等级
* 工厂方法是为了解决同一产品等级的业务抽象问题
* 产品族，java的视频，java的手记都属于java，他们是同一个产品族
* java的视频，
* 美的冰箱，美的的空调属于同一产品族
* */
