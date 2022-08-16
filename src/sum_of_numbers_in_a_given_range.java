import java.util.Scanner;

public class sum_of_numbers_in_a_given_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        int a = sc.nextInt();
        System.out.println("Enter the ending number: ");
        int b = sc.nextInt();
        int sum = 0;
        for (int i=a; i<=b; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
