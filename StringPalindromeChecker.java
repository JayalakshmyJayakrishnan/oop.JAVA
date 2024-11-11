import java.util.*;
import java.lang.Thread;

class PalindromeChecker implements Runnable {
    private String input;
    public PalindromeChecker(String input) {
        this.input = input;
    }
    
    public void run() {
        if(isPalindrome(input)) {
            System.out.print(input + " is a palindrome.");
        } else {
            System.out.print(input + " is not a palindrome.");
        } 
    
        } private boolean isPalindrome(String input) {
            int left = 0;
            int right = input.length() -1;
            if(left < right) {
                while(input.charAt(left)!= input.charAt(right)) {
                    return false;
                }left ++;
                right--;
            }return true;
        }
    }
    
    class StringPalindromeChecker {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter a string: ");
            String input = sc.nextLine();
            
            Thread thread = new Thread(new PalindromeChecker(input));
            thread.start();
        }
    }


/* OUTPUT
Enter a string: JJ
JJ is a palindrome.
=== Code Execution Successful ===
  */
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
