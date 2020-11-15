package design.pattern.creational.FactoryMethod;

/**
 * @author baihui
 * @create 2020/11/1
 */

public class Test {
    public static void main(String[] args) {
        VedioFactory factory = new JavaVedioFactory();
        Vedio vedio =  factory.getVedio();
        vedio.produce();
    }
}
