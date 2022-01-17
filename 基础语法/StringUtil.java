import java.util.Scanner;

public class StringUtil
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        StringBuilder bbb = new StringBuilder(a);
        StringBuilder ddd = new StringBuilder();
        for (int i = 0; i < bbb.length(); i++)
        {
            if (bbb.charAt(i) != ' ')
                ddd.append(bbb.charAt(i));
        }
        System.out.println(ddd);
    }
}