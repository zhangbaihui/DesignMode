package design.pattern.creational.FactoryMethod;

/**
 * @author baihui
 * @create 2020/11/9
 */

public class JavaVedioFactory extends VedioFactory{

    @Override
    public Vedio getVedio() {
        return new JavaVedio();
    }
}
