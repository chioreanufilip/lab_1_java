import javax.lang.model.type.NullType;
import java.util.ArrayList;
public class Exercises1 {
    ///first subpunct
    ArrayList<Integer> notSufficient(ArrayList<Integer> grades){
        ArrayList<Integer> notSufList = new ArrayList<>() ;
        for (int i = 0; i < grades.size(); i++){
            if (grades.get(i) < 40) notSufList.add(grades.get(i));
            if (grades.get(i) > 100 || grades.get(i)<0) throw  new RuntimeException();
        }
        return notSufList;
    }
///second subpunct
    int average(ArrayList<Integer> grades){
        int sum = 0;
        for (int i = 0; i < grades.size(); i++){
            if (grades.get(i) > 100 || grades.get(i)<0) throw  new RuntimeException();
            sum += grades.get(i);
        }
        return sum/grades.size();
    }
    ///third subpunct
    ArrayList<Integer> rounded(ArrayList<Integer> grades){
//        if (grades.getFirst()=NullType)throw new RuntimeException();
        ArrayList<Integer> roundedList = new ArrayList<>() ;
        for (int i = 0; i < grades.size(); i++){
            if (grades.get(i) > 100 || grades.get(i)<0) throw  new RuntimeException();
            if (grades.get(i)%5!=0){
                int x = grades.get(i)%5;
                if (x >=3){
                    grades.set(i,grades.get(i)+5-x);
                }
            }
        }
        return grades;
    }
    ///forth subpunct
    int max(ArrayList<Integer> grades){
        int max = 0;
        ArrayList<Integer> rounded = rounded(grades);

        for (int i = 0; i < grades.size(); i++){
            if (rounded.get(i)>max && grades.get(i)%5!=0 && grades.get(i)%5>=3){
                max = rounded.get(i);
            }
        }
        return max;

    }
}

