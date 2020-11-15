package design.pattern.creational.SimpleFactory;

import sun.misc.Version;

/**
 * @author baihui
 * @create 2020/11/1
 */

public class Test {
    public static void main(String[] args) {
        //Version1
        //Vedio vedio = new JavaVedio();
        //vedio.produce();
        //父类声明了一个引用指向了子类的一个实现
        //如果师挎包的时候，不让应用层代码不要依赖对应的实现类

        /*
        Version2
        导包的时候只需要引用VedioFactory,不需要 引用其他的
         */
        /*
        VedioFactory vedioFactory = new VedioFactory();
        Vedio vedio = vedioFactory.getVedio("java");
        if(vedio == null)
            return;
        vedio.produce();
        */

        /*
        Version3
         */
        VedioFactory vedioFactory = new VedioFactory();
        Vedio vedio = vedioFactory.getVedio(JavaVedio.class);
        if (vedio == null)
            return;
        vedio.produce();
    }
}
