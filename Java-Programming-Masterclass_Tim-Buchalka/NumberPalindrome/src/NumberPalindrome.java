public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int num = number;
        int lastDigit;
        while (num != 0) {
            lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
        }

        return number == reverse;
    }
}
