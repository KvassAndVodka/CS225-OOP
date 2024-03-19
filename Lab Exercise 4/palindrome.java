import java.util.Scanner;

public class palindrome{
    static boolean isPalindrome(char[] arr){
        int len = arr.length;
        
        for (int i = 0; i < len / 2; i++){
            if (arr[i] != arr[len - i - 1]){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Enter a word: ");
        String word = scan.nextLine();
        
        char[] wordArray = word.toCharArray();
        
        if(isPalindrome(wordArray)){
            System.out.println(word + " is a palindrome.");
        }
        else {
            System.out.println(word + " is not a palindrome.");
        }
        
        
        scan.close();
    }    
}

