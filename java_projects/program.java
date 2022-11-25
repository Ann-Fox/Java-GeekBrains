
package java_projects;

import java.util.Scanner;

/**
 * program
 */
public class program {

    public static void main(String[] args) {
        short age = 10;
        int salary = 123456;
        System.out.println(age); // 10
        System.out.println(salary); // 123456

        float e = 2.7f;
        double pi = 3.1415;
        System.out.println(e); // 2.7
        System.out.println(pi); // 3.1415

        char ch = '1';
        System.out.println(Character.isDigit(ch)); // true
        ch = 'a';
        System.out.println(Character.isDigit(ch)); // false

        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true

        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); // true

        boolean flag3 = flag1 ^ flag2; // дизъюнкция
        System.out.println(flag3); // false

        String msg = "Hello world";
        System.out.println(msg); // Hello world

        // Неявная типизация
        var a = 123;
        System.out.println(a); // 123
        var d = 123.456;
        System.out.println(d); // 123.456

        // System.out.println(getType(a)); // Integer
        // System.out.println(getType(d)); // Double

        // d = 1022;
        // System.out.println(d); // 1022
        // d = "mistake";
        // error: incompatible types:
        // String cannot be converted to double

        // static String getType(Object o){
        // return o.getClass().getSimpleName();
        // }

        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648


        // Получение данных из терминала

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();


        Scanner iScanner2 = new Scanner(System.in);
        System.out.printf("int a: ");
        int x = iScanner2.nextInt();
        System.out.printf("double a: ");
        double y = iScanner2.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);
        iScanner2.close();


    }

}
