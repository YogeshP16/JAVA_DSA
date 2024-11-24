/*
 Operation	Code	Explanation

Length	                   s.length();	Returns the number of characters in the string.
Character at Index	       s.charAt(2);	Returns the character at index 2.
Concatenation	           s1 + s2; or s1.concat(s2);	Combines two strings.
Index of Char/Substr	   s.indexOf('o'); or s.indexOf("lo");	Returns the index of the first occurrence.
Substring	               s.substring(1, 4);	Returns a part of the string.
Replace	                   s.replace('l', 'x');	Replaces all occurrences of l with x.
Starts With  	           s.startsWith("He"); 
Ends With                  s.endsWith("ld");	Checks prefix/suffix.
Trim	                   s.trim();	Removes leading and trailing spaces.
Split	                   s.split(" ");	Splits the string into an array.
To Upper                   s.toUpperCase();
To Lower Case	           s.toLowerCase();	Converts case.
Equality	               s.equals("Hello");	Checks content equality.

 */


public class OO2_OPERATIONS {
    public static void main(String[] args) {

        String s1 ="Hello";
        String s2 = "there";
        
        System.out.println(s1.length());
        System.out.println(s1.charAt(3));
        System.out.println(s1 +" " +s2);
        System.out.println(s1.indexOf(s2));
        
    }
    




}
