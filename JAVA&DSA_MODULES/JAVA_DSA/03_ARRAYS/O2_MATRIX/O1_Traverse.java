package O2_MATRIX;

public class O1_Traverse {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {23,45,67}, {56,78,9}};

        for(int i=0; i< arr.length; i++){
            for(int j=0; j < arr[i].length; j++){
                System.out.print(arr[i][j] +" ");

            }
            System.out.println();
        }
    }

}


/*
output 

1 2 3 
23 45 67
56 78 9 

*/