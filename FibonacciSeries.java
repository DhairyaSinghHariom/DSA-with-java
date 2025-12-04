import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many terms: ");
        int n = sc.nextInt();

        int a = 0;   // first term
        int b = 1;   // second term

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " "); // print current term

            int c = a + b;  // next term
            a = b;          // move forward
            b = c;
        }

        sc.close();
    }
}
