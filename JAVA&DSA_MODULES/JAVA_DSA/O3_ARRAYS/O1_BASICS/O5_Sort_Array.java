package O1_BASICS;

import java.util.Arrays;

public class O5_Sort_Array {
    public static void main(String[] args) {
        
        int[] arr={12,34,45,6,78,8};    // 6 8 12 34 45 78 
        Arrays.sort(arr);

        // to print
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

}

