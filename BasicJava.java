
import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava{

    public void print1To255(){
        for(int i = 1; i <= 255; i++){
            System.out.println(i);
        }
    }


    public void printOdd(){
        for(int i = 1; i <= 255; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }




    public int findMax(int[] myArray){
        int max = myArray[0];
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] > max){
                max = myArray[i];
            }
        }
        return max;
    }


    public void printSum(){
        int sum = 0;
        for(int i = 0; i <= 255; i++){
            sum += i;
            System.out.printf("New Number: %d Sum: %d\n", i, sum);
        }
    }
        
    

    public void iterateArray(int[] myArray){
        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }


    public int getAverage(int[] myArray){
        int sum = 0;
        int avg = 0;
        for(int i = 0; i < myArray.length; i++){
            sum += myArray[i];
            avg = sum/myArray.length;
        }
        return avg;
    }


    public ArrayList arrayWithOddNumbers(){
        ArrayList <Integer> myArray = new ArrayList <Integer>();
        for(int i = 0; i <= 255; i++){
            if(i % 2 != 0){
                myArray.add(i);
            }
        }
        return myArray;
    }


    public ArrayList greaterThanY(int[] arr, int y){
        ArrayList <Integer> myArray = new ArrayList <Integer>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > y){
                myArray.add(arr[i]);
            }
        }
        return myArray;
    }

    public void arraySquared(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] *= arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }


    public int[] negativeTo0(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                arr[i] = 0;
            }
        }
        return arr;
    }

    public void maxMinAverage(int[] arr){
        int maxVal = arr[0];
        int minVal = arr[0];
        int sum = 0;
        int avg = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
            else if(arr[i] < minVal){
                minVal = arr[i];
            }
        }
        avg = sum/arr.length;
        System.out.printf("Max Value is: %d\nMin Value is: %d\nAverage is: %d\n", maxVal, minVal, avg);
    }


    public int[] shiftArrayValues(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
        return arr;
    }
}