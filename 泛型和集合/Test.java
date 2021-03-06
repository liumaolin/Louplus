import java.util.List;
import java.util.ArrayList;

public class Test {

  // List<?> 表示接受一个元素为任意类型的列表 List。
    public void testDemo(List<?> s){
        for(Object obj:s){
            System.out.println("我的类型是" + obj.getClass().getName());
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Test test = new Test();
        Dog a0 = new Dog();
        Animal a1 = new Animal();
    // 声明一个接收元素类型是 Animal 的列表 List s。
    // 然后创建一个元素类型是 Animal 的 ArrayList 赋值给 s。
        List<Animal> s = new ArrayList<Animal>();
    // Dog a0 是 Animal 的子类，可以向上转型为 Animal 类型
        s.add(a0);
        s.add(a1);
        test.testDemo(s);
    }

}