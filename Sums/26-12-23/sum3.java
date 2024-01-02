public class Main {
    public static void main(String[] args) {
        int number = 12345; 
        int sum = calculateSumOfDigits(number);
        System.out.println("Sum of digits: " + sum);
    }
    private static int calculateSumOfDigits(int number) {
        int sum = 0;
        for (int n = number; n > 0; n /= 10) {
            int digit = n % 10;
            sum += digit;
        }

        return sum;
    }
}
