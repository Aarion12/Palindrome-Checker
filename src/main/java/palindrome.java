//first attempt

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a phrase. ");

        String phrase = input.next();

        if (isPalindrome(phrase) == 0) {
            System.out.print("Is a palidrome. ");
        } else {System.out.print("Is not a palidrome. ");}

    } ///

    public static int isPalindrome(String str) {
        String reversed = "";
    
        for (int i = str.length()-1; i >= 0; i--) {
            
            reversed += str.charAt(i);
        }
        
        //compares unicode to see if the characters unicode in each str equal eachother, *value inc/decr when order of chars change*
        //ingnorecase ignores capital and lowercase letters   
        return reversed.compareToIgnoreCase(str);
    }
}

//*method only* way

/*public static boolean isPalindrome(String str) {
    // Remove spaces and convert to lowercase
    str = str.replaceAll("\\s+", "").toLowerCase();
    
    int left = 0;
    int right = str.length() - 1;
    
    while (left < right) {
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    
    return true;
} */

