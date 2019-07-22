package ua.bondar;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SpecialSort {

    public static void main(String[] args) {
        runSort();
    }

    private static void runSort() {

        List<Integer> list = Arrays.asList(40, 1, 21, 5, 16, 10, 12, 17, 4, 25); //896
        Collections.sort(list,Collections.reverseOrder());
        int fromIndex = 1;
        int toInd = list.size()-1;
        while ( fromIndex < toInd ) {
            changeElement(list,fromIndex,toInd);
            fromIndex +=2;
            toInd -=2;
        }
        printList(list);
    }

    private static void changeElement(List<Integer> list, int fromInd, int toInd) {
        list.set(fromInd,list.get(toInd)+list.get(fromInd));
        list.set(toInd,list.get(fromInd)-list.get(toInd));
        list.set(fromInd,list.get(fromInd)-list.get(toInd));        
    }

    private static void printList(List<Integer> list) {
            System.out.println(list);
            Long l = 0L;
            for (int i = 1; i < list.size() ;i++) {
                l = l+ (list.get(i-1) * list.get(i));
            }
        System.out.println("Sum ="+l);
    }
}
