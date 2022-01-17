public class StringBuilderTest {
    public static void main(String[] args){
        StringBuilder s1 = new StringBuilder();
        s1.append("java");
        StringBuilder s2 = new StringBuilder(5);
        StringBuilder s3 = new StringBuilder("shiyanlou");
        System.out.println("s1:" + s1.toString() + "\tcap:" + s1.capacity());
        System.out.println("s2:" + s2.toString() + "\tcap:" + s2.capacity());
        System.out.println("s3:" + s3.toString() + "\tcap:" + s3.capacity());
    }
}