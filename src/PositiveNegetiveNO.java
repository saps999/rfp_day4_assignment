import java.util.Scanner;

public class PositiveNegetiveNO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        if (a>0) {
            System.out.println("The given number is positive");
        } else if (a == 0) {
            System.out.println("The given number is zero");
        } else {
            System.out.println("The given number is negative");
        }
    }
}
