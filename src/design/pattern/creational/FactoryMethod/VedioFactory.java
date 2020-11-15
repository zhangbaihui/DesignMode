package design.pattern.creational.FactoryMethod;

/**
 * @author baihui
 * @create 2020/11/1
 */

public abstract class VedioFactory {

    //什么时候使用抽象类，我们这个类对于某些行为或者某些属性是已知的，使用抽象类可以
    //如果都是未知的，用接口即可。
    public abstract Vedio getVedio();
//    public Vedio getVedio(String type) {
//        if ("java".equalsIgnoreCase(type)) {
//            return new JavaVedio();
//        } else if ("python".equalsIgnoreCase(type)) {
//            return new PythonVedio();
//        }
//        return null;
//    }

    /*
    通过反射来实现
    优点：如果新增新的课程类，不需要修改此工厂方法
     */
//    public Vedio getVedio(Class c) {
//        Vedio vedio = null;
//        try {
//            vedio = (Vedio) Class.forName(c.getName()).newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return vedio;
//    }
    //现在VedioFactory没有子类，所有类的创建都在这个方法，
}
