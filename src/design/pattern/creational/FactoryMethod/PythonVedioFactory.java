package design.pattern.creational.FactoryMethod;

/**
 * @author baihui
 * @create 2020/11/9
 */

public class PythonVedioFactory extends VedioFactory {
    @Override
    public Vedio getVedio() {
        return new PythonVedio();
    }
    //VedioFactory 只定义规范和契约，不定义产生哪一种视频，生产视频放在子类中实现。
}
