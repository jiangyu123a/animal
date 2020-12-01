package animal;

import java.util.*;

import method.*;

import static method.add.modify;

public class main {

    public static List<ann> anns = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-------动物管理系统--------");
        boolean flag = true;
while(flag){

    System.out.println("1增加");
    System.out.println("2删除");
    System.out.println("3修改");
    System.out.println("4查询");
    System.out.println("5排序");
    System.out.println("6退出");
    int choise = scan.nextInt();
    switch (choise) {
        case 1:
            anns.add(add.add());
            break;
        case 2:
            String str0 = add.delete();

            Iterator<ann> ite = anns.iterator();
            while (ite.hasNext()) {
                if (ite.next().getSpecies().equals(str0)) ;
                ite.remove();
            }
            break;
        case 3:
            String str1 = modify();
            Iterator<ann> ite2 = anns.iterator();
            while (ite2.hasNext()) {
                if (ite2.next().getSpecies().equals(str1)) ;
                System.out.println("请输入要修改物种的年龄");
                int age = scan.nextInt();
                System.out.println("请输入要修改物种的性别");
                String str = scan.next();
                ite2.next().setAge(age);
                ite2.next().setXex(str);
            }
            break;
        case 4:
            String s = add.query();
            Iterator<ann> ite3 = anns.iterator();
            while (ite3.hasNext()) {
                if (ite3.next().getSpecies().equals(s)) ;
                System.out.println(ite3.next().toString());
            }
            break;
        case 5:
            Collections.sort(anns);
            Iterator<ann> ite4 = anns.iterator();
            while (ite4.hasNext()) {
                System.out.println(ite4.next().toString());
            }
            break;
        case 6:
            flag = false;
            break;
        default:
            throw new IllegalStateException("Unexpected value: " + choise);
    }
}
}

}
