



            /*21.	Given two array lists A and B, A has an element that is not in B while the other
             elements are the same in both two lists. Find that missing element in B.
              (This is a live coding challenge. Any programming language is fine.)*/


import java.util.*;

public class IfIsNotInA {
    public static List solution(int[] first, int[] second) {
        ArrayList<Integer> firstArrayList = new ArrayList<Integer>();
        ArrayList<Integer> secondArrayList = new ArrayList<Integer>();
        for (int i = 0; i < first.length; i++) {
            firstArrayList.add(first[i]);
        }
        for (int i = 0; i < second.length; i++) {
            secondArrayList.add(second[i]);
        }

        for (Integer x : secondArrayList)
            if (firstArrayList.contains(x)) {
                firstArrayList.remove(x);
            }
        return firstArrayList;
    }

    public static void main(String[] args) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {1, 2, 3, 4,9,7,6,11,0,3,77,8,9};
        System.out.println(solution(one, two));
    }
}
