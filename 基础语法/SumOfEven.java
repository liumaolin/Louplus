public class SumOfEven{
    public static void main(String[] args)
    {
        methodWhile();
        methodDoWhile();
        methodFor();
    }
    public static void methodWhile()
    {
        int i = 0;
        int sum = 0;
        while (i++ < 1000)
        {
            if (i%2 == 0)
                sum += i;
        }
        System.out.println("while方法：" + sum);
    }
    public static void methodDoWhile()
    {
        int i = 0;
        int sum = 0;
        do
        {
            if (++i%2 == 0)
                sum += i;
        }while (i < 1000);
        System.out.println("do-while方法：" + sum);
    }
    public static void methodFor()
    {
        int sum = 0;
        for (int i = 1; i <= 1000; i++)
        {
            if (i%2 == 0)
                sum += i;
        }
        System.out.println("for方法：" + sum);
    }
}