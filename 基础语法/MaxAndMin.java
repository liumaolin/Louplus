public class MaxAndMin{
    public static void main(String[] args)
    {
        int[] data = {313, 89, 123, 323, 313, 15, 90, 56, 39};
        int min = data[0], max = data[0];
        for (int i : data)
        {
            min = min < i ? min : i;
            max = max > i ? max : i;
        }
        System.out.println("最大值："+max+" 最小值："+min);
    }
}