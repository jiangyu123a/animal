package method;

import animal.ann;
import animal.*;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class add {
    public static Scanner scan = new Scanner(System.in);

    public static ann add() {
        System.out.println("请输入物种类别");
        String spe = scan.next();
        System.out.println("请输入物种年龄");
        int age = scan.nextInt();
        System.out.println("性别");
        String sex = scan.next();
        System.out.println("吃什么");
        String eat = scan.next();
        ann an = new ann(age, sex, spe, eat);
        return an;


    }

    public static String delete() {
        System.out.println("请输入删除的物种");
        String str = scan.next();
        return str;
    }

    public static String modify() {
        System.out.println("请输入要修改的物种");
        String str = scan.next();
        return str;
    }

    public static String query() {
        System.out.println("请输入查询的物种");
        String next = scan.next();
        return next;
    }
}
