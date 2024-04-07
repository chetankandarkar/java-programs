import java.util.Arrays;
import java.util.HashSet;

public class RemoveRepeatedElements {

    public static void main(String[] args) {

        int[] arr = { 4, 5, 5, 5, 4, 3, 2, 1, 0};

        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }

        int[] newArr = new int[set.size()];
        int i= 0;
        for (int element: set){
            newArr[i++] = element;
        }

        for(int j=0; j< newArr.length; j++){
            System.out.println(newArr[j]);

        }

        System.out.println(Arrays.toString(newArr));


    }
}
