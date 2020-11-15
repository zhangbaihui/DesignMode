package design.pattern.creational.SimpleFactory;

/**
 * @author baihui
 * @create 2020/11/1
 */

public class PythonVedio extends Vedio{
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
