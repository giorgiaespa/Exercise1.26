import java.util.Arrays;

public class Exercise26{
    public static void main(String[] args){
        int[] numbers = {3, 5, 6, 8, 2, 3, 1, 7, 3, 7, 9, 4};
        isDuplicated(numbers);
    }
    public static void isDuplicated(int [] array) {
        for (int i = 0; i <array.length; i++){
            Arrays.sort(array);

            if (i == 0 || array[i] != array [i-1]) {
                System.out.print (array[i] + " ");
            }
        }
    }
}