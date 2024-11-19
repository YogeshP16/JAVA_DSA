package O1_BASICS;

public class O1_SumofElements {
    public static void main(String[] args) {
        int[] arr = {12,23,4,56,67};

        //find sum

        int sum =0;
        for(int i =0; i<arr.length; i++){
            sum += arr[i];  

        }
        System.out.println("sum : "+sum);

        // find average

        double avg = (double)sum/arr.length;
        System.out.println("avg : "+avg);



        
        
    }
    

}
