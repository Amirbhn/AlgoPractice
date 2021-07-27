import java.util.Arrays;

public class FindCloseNumbers {

/*    public static boolean solution(int[] numbers) {
        // define a boolean value with "false" as default value to be returned at the end
        boolean result = false;

        // check if array has more than elements, other wise return false
        if (numbers.length < 2) {
            result = false;
        }

        // otherwise go through the array to check of we can find a pair of numbers with one value difference
        else {

            // first sort the array
            Arrays.sort(numbers);

            // then use a for loop start from first element to check if the next one meet the condition or not
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] + 1 == numbers[i + 1]) {
                    result = true;
                }
            }
        }
        return result;
    }*/

    public static boolean solution (int[] array ){
        // first of all we check the array length to see if it has fewer than 2 elements return false
        if(array.length<2){return false;}

        // then we define boolean variable with "false" default value to returned at the end
        boolean result = false;

        // then we go through the array to check if we have any element with one difference in their value
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if (array[i]+1 ==array[j] || array[i]-1 == array[j]){result =true;}
            }
        }return result;
    }

    public static void main(String[] args) {
        int[] a = {6, 5, 33, 1, 9};
        System.out.println(solution(a));
    }

}
{"mode":"full","isActive":false}