public class StringTest {
    public static void main(String[] args) {
         String s = "abcdefabc";
         System.out.println("字符a第一次出现的位置为"+s.indexOf('a'));
         System.out.println("字符串bc第一次出现的位置为"+s.indexOf("bc"));
         System.out.println("字符a最后一次出现的位置为"+s.lastIndexOf('a'));
         System.out.println("从位置3开始到结束的字符串"+s.substring(3));
         System.out.println("从位置3开始到6之间的字符串"+s.substring(3,6));
    }
}