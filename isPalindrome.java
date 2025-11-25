public class isPalindrome {

    static boolean isPalindrome(int n) {
        int original = n;
        int rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }

        return original == rev;
    }

    public static void main(String[] args) {
        int n = 12321;

        if (isPalindrome(n))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
