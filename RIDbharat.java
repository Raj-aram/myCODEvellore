import java.util.Scanner;

public class RIDbharat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close(); 
    }

    public static boolean isPalindrome(int num) {
        if (num < 0) {
            return false; 
        }

        int originalNumber = num;
        int reversedNumber = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            num /= 10;
        }

        return originalNumber == reversedNumber;
    }
}