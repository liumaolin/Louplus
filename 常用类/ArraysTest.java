import java.util.Arrays;

public class ArraysTest{
    public static void main(String[] args)
    {
        int[] data = {6, 17, 92, 32, 58, 22, 84, 66, 36, 33};
        Arrays.sort(data);
        System.out.println("sort排序后：" + Arrays.toString(data));
        int i = Arrays.binarySearch(data, 33);
        System.out.println("值为33的元素索引："+i);
    }
}