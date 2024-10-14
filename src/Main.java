//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
        Exercises1 m = new Exercises1();
        ArrayList<Integer> n = new ArrayList<>();
        n.add(35);
        n.add(89);
        n.add(67);
        n.add(90);
        n.add(5);
//        n.add(-5);
//        m.notSufficient(n);
//        for (int i=0;i<m.notSufficient(n).size();i++){

//        }
//        System.out.println(m.notSufficient(n));
        System.out.println(m.max(n));
//        System.out.println(m.rounded(n));
//        System.out.println(m.average(n));
//        for (int i = 1; i <= 5; i++) {
//            TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//             for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
    }
}