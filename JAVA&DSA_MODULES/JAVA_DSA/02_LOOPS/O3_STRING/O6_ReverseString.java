package O3_STRING;

public class O6_ReverseString {
    public static void main(String[] args) {

        // reverse String

        String str ="hello";
        String rev ="";
        
        for(int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);

        }
        System.out.println(rev); // olleh
        
    }
    
    

}