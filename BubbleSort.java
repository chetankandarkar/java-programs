import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int arrSize = sc.nextInt();

        int[] arr = new int[arrSize];
        System.out.println("Enter the element of array");
        for(int i =0; i<arrSize; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Your Enter Array" +Arrays.toString(arr));

        for(int i=0; i<arr.length -1; i++){
            for(int j=0; j<arr.length-1 -i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
