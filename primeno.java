import java.util.Scanner;

public class Primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        int c = 2;
        boolean isPrime = true;

        while (c < num) {
            if (num % c == 0) {
                isPrime = false;
                break;
            }
            c++;
        }

        if (isPrime && num > 1) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is Not Prime");
        }
    }
}
