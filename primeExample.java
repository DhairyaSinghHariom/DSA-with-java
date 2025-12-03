public class primeExample {

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 29;

        if (isPrime(n))
            System.out.println(n + " is a Prime Number");
        else
            System.out.println(n + " is Not a Prime Number");
    }
}       