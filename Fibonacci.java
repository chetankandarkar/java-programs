import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of fibonacci series you want");
        int num = sc.nextInt();

        int a=0, b=1;
        for (int i=0; i < num; i++){
            System.out.print( a + " ");
            int nextNum = a + b;
            a = b;
            b = nextNum;

        }
    }
}
