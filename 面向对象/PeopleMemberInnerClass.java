// PeopleMemberInnerClass.java
//外部类PeopleMemberInnerClass
public class PeopleMemberInnerClass {
    private String name = "LiLei";         //外部类的私有属性
    //内部类Student
    public class Student {
        String ID = "20151234";               //内部类的成员属性
        private String name = "HanMeiMei";         //内部类的私有属性
        //内部类的方法
        public void stuInfo(){
            System.out.println("访问外部类中的name：" + PeopleMemberInnerClass.this.name);
            System.out.println("访问内部类中的name：" + name);
            System.out.println("访问内部类中的ID：" + ID);
        }
    }

    //测试成员内部类
    public static void main(String[] args) {
        PeopleMemberInnerClass a = new PeopleMemberInnerClass();     //创建外部类对象，对象名为a
        Student b = a.new Student(); //使用外部类对象创建内部类对象，对象名为b
        // 或者为 PeopleMemberInnerClass.Student b = a.new Student();
        b.stuInfo();   //调用内部对象的stuInfo方法
    }
}