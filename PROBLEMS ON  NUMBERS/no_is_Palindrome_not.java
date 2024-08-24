public class no_is_Palindrome_not{
    public static boolean isPalindrome(int num){
        String strNumber = Integer.toString(num);
        int length = strNumber.length();
        for(int i=0; i<length/2; i++){
            if(strNumber.charAt(i)!=strNumber.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }

    //for String
    public static boolean isPalindrome_for_string(String str){
        int n = str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    /*
    Find all Palindrome Numbers in a given range
    Problem Statement: Given a range of numbers, find all the palindrome numbers in the range.
    Note: A palindromic number is a number that remains the same when its digits are reversed.OR  a palindrome is a number that reads the same forward and backward Eg: 121,1221, 2552 */
    public static void printPalindromesInRange(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (isPalindrome_for_string(Integer.toString(i))) { //we used string function from 2nd question
                System.out.print(i + " ");
            }
        }
        System.out.println(); // To move to the next line after printing all palindromes
    }

      
    public static void main(String[] args) {
        int num = 12321;
        String str = "RACECAR";
        int min1 = 10, max1 = 50;
        System.out.print("Output for range " + min1 + " to " + max1 + ": ");
        printPalindromesInRange(min1, max1); //for in range 
        System.out.println(isPalindrome(num)); // for number
        System.out.println(isPalindrome_for_string(str)); //for string


    }
}