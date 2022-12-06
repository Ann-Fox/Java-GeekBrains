package seminar_3;
/* Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
𑠀
String s1 = "hello";
𑠀
String s2 = "hello";
𑠀
String s3 = s1;
𑠀
String s4 = "h" + "e" + "l" + "l" + "o";
𑠀
String s5 = new String("hello");
𑠀
String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'}); */
public class task_0 {
    public static void main(String[] args) {
        String s1 = "hello";
        // String s2 = "hello";
        // String s3 = s1;
        // String s4 = "h" + "e" + "l" + "l" + "o";
        // String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(s1 == s6);
        /* shift + alt + a  создать сногострочный комментарий*/
        System.out.println(s1.equals(s6));
    }
}
