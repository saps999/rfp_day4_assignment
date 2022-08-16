import java.util.Scanner;

public class prime_no_within_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower number: ");
        int a = sc.nextInt();
        System.out.println("Enter upper number: ");
        int b = sc.nextInt();
        int temp = 0;
        for (int i = a; i<=b; i++) {
            for (int n=2; n<=i-1; n++) {
                if (i%n == 0){
                    temp = temp +1;
                }
            }
            if (temp==0){
                System.out.println(i+ " is a prime number");
            } else {
               temp =0;
                System.out.println(i+ " is not a prime number");
            }
        }
    }
}
