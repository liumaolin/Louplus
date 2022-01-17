import java.util.Scanner;

public class ContrastString
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        if (a.length() != b.length())
        {
            System.out.println("不同");
            return;
        }
        int i = 0;
        for (; i < a.length(); i++)
        {
            if (a.charAt(i) != b.charAt(i))
            {
                System.out.println("不同");
                return;
            }
        }
        System.out.println("相同");
    }
}