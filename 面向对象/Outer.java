// Outer.java
//匿名内部类没有名字，所以只能使用一次，它通常用来简化代码编写
//使用匿名内部类的前提条件：必须继承一个父类或实现一个接口。
public class Outer {

    public Inner getInner(final String name, String city) {
        return new Inner() {
            private String nameStr = name;
            public String getName() {
                return nameStr;
            }
        };
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.getInner("Inner", "NewYork");
        System.out.println(inner.getName());
    }
}
interface Inner {
    String getName();
}