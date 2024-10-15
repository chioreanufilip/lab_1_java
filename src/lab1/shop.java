package lab1;
import javax.lang.model.type.NullType;
import java.util.ArrayList;
//import .Exercise2;
public class shop {
Exercise2 Num = new Exercise2();
///1 subpunct
int cheapest(ArrayList<Integer> arr){
    return Num.minNumber(arr);
}

///2 subpunct
    int mostExpensive(ArrayList<Integer> arr,ArrayList<Integer> arr2){
        int expensive1 = Num.maxNumber(arr);
        int expensive2 = Num.minNumber(arr2);
        if (expensive1 > expensive2) return expensive1;
        else return expensive2;
    }

/// 3 subpunct

    int moneyCanBuy(ArrayList<Integer> arr, int money){
        while (!arr.isEmpty()){
        int max = Num.maxNumber(arr);
        if (max<money) return max;
        arr.remove(Integer.valueOf(max));
        }
        return 0;
    }

///4 subpunct
    int maxMoneyBuy(ArrayList<Integer> tastaturen, ArrayList<Integer> USB,int money){

        while (!tastaturen.isEmpty() && !USB.isEmpty()){
            int max = Num.maxNumber(tastaturen);
            int max1  = Num.minNumber(USB);
            if (max+max1<=money) return max+max1;
            if (max<max1) USB.remove(Integer.valueOf(max1));
            if (max>=max1) tastaturen.remove(Integer.valueOf(max));
        }
        return -1;
    }
}
