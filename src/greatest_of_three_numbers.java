import java.util.Scanner;

public class greatest_of_three_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        int c = sc.nextInt();
        if (a>b & a>c) {
            System.out.println("greatest no is:"+a);
        } else if (b>c & b>a) {
            System.out.println("greatest no is:"+b);
        } else if (c>a & c>b){
            System.out.println("greatest no is:"+c);
        }
    }
}
