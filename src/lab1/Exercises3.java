package lab1;

import java.util.ArrayList;
public class Exercises3 {
    ArrayList<Integer> sumArr(ArrayList<Integer> first, ArrayList<Integer> second) {
        ArrayList<Integer> sum = new ArrayList<>();
        int size;
        if (first.size() < second.size()) {
            size = first.size();
            int sizeMax = second.size();
            int ten =0;
            for (int i = size-1; i >= 0; i--){
                int add = first.get(i)+second.get(sizeMax-1);sizeMax--;
                if (add >= 10){
                    add -= 10;
                    sum.add(0, add+ten);
                    ten = 1;
                }
                else {sum.add(0, add+ten);
                    ten =0;
                }

            }
            for (int i = second.size()-size-1; i>=0; i--){
                if (i==second.size()-size-1){
                    if (ten==1) sum.add(0,first.get(i)+1);
                }
                else {
                sum.add(0,second.get(i));
                }
            }
        }
        else {size = second.size();
            int sizeMax = first.size();
            int ten =0;
        for (int i = size-1; i >= 0; i--){
            int add = second.get(i)+first.get(sizeMax-1);sizeMax--;
            if (add >= 10){
                add -= 10;
                sum.add(0, add+ten);
                ten = 1;
            }
            else {
                sum.add(0, add+ten);
                ten =0;
            }

        }
        for (int i = first.size()-size-1; i>=0; i--){
            if (i==first.size()-size-1){
                if (ten==1) sum.add(0,first.get(i)+1);
            }
            else{
            sum.add(0,first.get(i));
            }
        }
    }
        return sum;
    }

    ArrayList<Integer> subtraction(ArrayList<Integer> first, ArrayList<Integer> second) {
        ArrayList<Integer> sub = new ArrayList<>();
        int size = first.size();
        int ten =0;
        for (int i = size-1; i >= 0; i--){
            int add = first.get(i)-second.get(i)-ten;
            if (add<0){
                sub.add(0,10+add);
                ten=1;
            }
            else {sub.add(0,add);
                ten=0;
            }
        }
        if (sub.get(0) == 0){
        while (!sub.isEmpty()) {
            if (sub.get(0) == 0) sub.remove(0);
            else return sub;
        }
        }
        return sub;
    }

    ArrayList<Integer> multiplication(ArrayList<Integer> a, int b) {
        if (b>=10 || b<0) throw new RuntimeException();
        ArrayList<Integer> multi = new ArrayList<>();
        if (b==0) return multi;
        int ten =0;
        for (int i=a.size()-1; i>=0; i--) {
            int add = a.get(i)*b;
            if (add>=10){int add1=add;
                add=add%10+ten;
                if (add>=10){
                    add-=10;
                    ten=1;
//                    ten=add/10+1;
                    multi.add(0,add);
                }
                else{
                    multi.add(0,add);
                    ten = add1/10;
                }

            }
            else {add +=ten;
                multi.add(0,add);
                ten=0;
            }
//                multi.add(0,add%10+ten);
//                ten = add/10;
        }
        if (ten!=0)  multi.add(0,ten);
        return multi;
    }

    ArrayList<Integer> division(ArrayList<Integer> a, int b) {
        if (b==0) return a;
        ArrayList<Integer> div = new ArrayList<>();
        int ten =0;
        for (int i =0; i<a.size(); i++) {int add;
            if (ten!=0) {add = (ten*10+a.get(i))/b;
            ten = (ten*10+a.get(i))%b;
            div.add(add);
            }
            else{
                ten = a.get(i)%b;
                add= a.get(i)/b;
                if (add!=0){
                    div.add(add);
                }
            }
        }return div;
    }
}
