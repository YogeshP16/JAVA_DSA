package O1_CONDITIONAL;
/*
 * Count digits in a number
Key concept: Find the total number of digits in a number.

Approach:

Initialize a counter to 0.
Divide the number by 10 repeatedly until it becomes 0.
Increment the counter in each iteration.
The counter value is the number of digits.
Example:

Input: 12345 → Output: 5 digits
 */
public class O2_CountDigits {
    public static void main(String[] args) {
        int n = 1234434;
        int count =0;
        while(n > 0){
            //int lastdigit = n%10;
            count++;
            n/=10;
        }
        System.out.println(count);
    }

}
