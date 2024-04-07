public class PrintPattern {

    public static void main(String[] args) {

        for(int i=0; i<=5; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }


        System.out.println("new code ");
        //for reverce

        for(int i=0; i<5; i++){
            for(int j=0; j<5-i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
