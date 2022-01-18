import java.util.Arrays;

public class SystemTest{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 0};
        System.arraycopy(a, 1, b, 4, 1);
        System.out.println(Arrays.toString(b));
        System.out.println("java安装目录：" + System.getProperty("java.home"));
    }
}