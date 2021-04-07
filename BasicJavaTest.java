import java.util.ArrayList;
import java.util.Arrays;

public class BasicJavaTest{
    public static void main(String[] args){
        BasicJava basic13 = new BasicJava();

        basic13.print1To255();

        basic13.printOdd();

        basic13.printSum();

        int[] myArray = {1,3,5,7,9,13};
        basic13.iterateArray(myArray);

        int[] x = {-2, -3, -8, -5, -4};
        int maxNum = basic13.findMax(x);
        System.out.println(maxNum);

        int[] y = {2, 10, 3};
        int avgNum = basic13.getAverage(y);
        System.out.println(avgNum);

        ArrayList oddArray = basic13.arrayWithOddNumbers();
        System.out.println(oddArray);

        int[] arr = {1, 3, 5, 7};
        int yVal = 3;
        ArrayList greaterThan = basic13.greaterThanY(arr, yVal);
        System.out.println(greaterThan.size());

        int[] squaredArr = {1, 5, 10, -2};
        basic13.arraySquared(squaredArr);

        int[] negativeToZeroArr = {1, 5, 10, -2};
        int[] toZeroArr = basic13.negativeTo0(negativeToZeroArr);
        System.out.println(Arrays.toString(toZeroArr));

        int[] maxMinAvgArr = {1, 5, 10, -2};
        basic13.maxMinAverage(maxMinAvgArr);

        int[] originalArr = {1, 5, 10, 7, -2};
        int[] shiftedArray = basic13.shiftArrayValues(originalArr);
        System.out.println(Arrays.toString(shiftedArray));
    }  
}