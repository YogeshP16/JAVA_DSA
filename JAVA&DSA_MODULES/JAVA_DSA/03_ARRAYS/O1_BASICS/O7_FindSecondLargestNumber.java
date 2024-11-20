package O1_BASICS;

/*
 * Find the second largest number in an array
Key Concept: Identify the largest, then find the next largest distinct number.

Approach:

Initialize first and second as Integer.MIN_VALUE.
Traverse the array to update first and second accordingly.
Example:

Input: [3, 5, 7, 2, 8] → Output: Second Largest: 7
 */

public class O7_FindSecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {12,34,56,78,89};
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i =0; i< arr.length; i++){
            if( arr[i] > largest){
                secondlargest = largest;
                largest = arr[i];
                

            }else if( arr[i] > secondlargest && arr[i] != largest  ){
                secondlargest=arr[i];
            }

            
        }
        System.out.println(secondlargest);
        
    }

}
