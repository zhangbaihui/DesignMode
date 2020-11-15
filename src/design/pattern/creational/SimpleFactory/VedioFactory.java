package design.pattern.creational.SimpleFactory;

/**
 * @author baihui
 * @create 2020/11/1
 */

public class VedioFactory {
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
    public Vedio getVedio(Class c) {
        Vedio vedio = null;
        try {
            vedio = (Vedio) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return vedio;
    }
    //现在VedioFactory没有子类，所有类的创建都在这个方法，
}
