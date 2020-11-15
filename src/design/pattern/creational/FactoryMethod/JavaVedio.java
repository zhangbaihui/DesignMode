package design.pattern.creational.FactoryMethod;

/**
 * @author baihui
 * @create 2020/11/1
 */

public class JavaVedio extends Vedio {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
