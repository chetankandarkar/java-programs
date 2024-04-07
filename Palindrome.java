import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        boolean isPalindrome = true;

        for(int i=0; i< str.length() / 2; i++){
            if(str.charAt(i) != str.charAt(str.length() -1 -i)){
                isPalindrome = false;
                break;
            }

        }

        if(isPalindrome){
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
