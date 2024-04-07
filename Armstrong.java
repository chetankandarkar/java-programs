import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

//        Armstrong number is a positive number that is equal to the
//        sum of its own digits each raised to the power of the number of digits.

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        boolean isArmstrong = thisArmstrong(number);

        if(isArmstrong) {
            System.out.println("Number is Armstrong");
        } else {
                System.out.println("Number is not Armstrong");
            }
    }

    public static boolean thisArmstrong(int number){

        String numString = Integer.toString(number);
        int numofdigits = numString.length();

        int sum = 0;
        for (int i=0; i < numofdigits; i++){
            int digit = Character.getNumericValue(numString.charAt(i));
            sum += Math.pow(digit,numofdigits);
        }

        return sum == number;

    }
}
