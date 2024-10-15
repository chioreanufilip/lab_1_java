package lab1;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Exercises1 m = new Exercises1();
        ArrayList<Integer> n = new ArrayList<>();
        n.add(35);
        n.add(89);
        n.add(67);
        n.add(90);
        n.add(5);
//        System.out.println(m.notSufficient(n));
//        System.out.println(m.max(n));
//        System.out.println(m.rounded(n));
//        System.out.println(m.average(n));

        Exercise2 m2 = new Exercise2();
//        System.out.println(m2.sumWithoutMax(n));
//        System.out.println(m2.sumWithoutMin(n));
        Exercises3 m3 = new Exercises3();
        ArrayList<Integer> n2 = new ArrayList<>();
        ArrayList<Integer> n3 = new ArrayList<>();
        n2.add(1);
        n2.add(1);
        n2.add(1);
        n3.add(1);
        n3.add(9);
        n3.add(1);
        n3.add(1);
//        System.out.println(m3.sumArr(n2,n3));
        ArrayList<Integer> n4 = new ArrayList<>();
        ArrayList<Integer> n5 = new ArrayList<>();
        n4.add(2);
        n4.add(1);
        n4.add(1);
        n5.add(1);
        n5.add(1);
        n5.add(3);
//        System.out.println(m3.subtraction(n4, n5));



    ArrayList<Integer> n6 = new ArrayList<>();
    n6.add(5);
    n6.add(1);
    n6.add(7);
//    System.out.println(m3.multiplication(n6,2));

        ArrayList<Integer> n7 = new ArrayList<>();
        n7.add(1);
        n7.add(2);
        n7.add(2);
//        System.out.println(m3.division(n7,2));
        shop m4 = new shop();
        ArrayList<Integer> n8 = new ArrayList<>();
        n8.add(100);
        n8.add(150);
        n8.add(200);

        System.out.println(m4.moneyCanBuy(n8, 175));
        ArrayList<Integer> n9 = new ArrayList<>();
        n9.add(100);
        n9.add(25);
        n9.add(300);
        n9.add(40);
        System.out.println(m4.maxMoneyBuy(n8,n9, 175));
    }
}