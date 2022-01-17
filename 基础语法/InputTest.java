import java.util.Scanner;  

public class InputTest {  
    public static void main(String[] args) {  
        Scanner in = new Scanner(System.in);  
        String[] data = new String[100];  
        for (int i = 0; i < 100; i++)
        {
            data[i] = in.nextLine();
            if (data[i].equals("end"))
                break;
        }
        for (String s : data)
        {
            if (s.equals("end"))
                break;
            System.out.println(s);
        }
    }
}