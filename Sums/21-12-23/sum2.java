public class Main {
    public static void main(String[] args) {
        long number = 1234; 
        long result = sumOfDigitsPower(number);
        System.out.println("Output: " + result);
    }
    private static long sumOfDigitsPower(long number) {
        int numDigits = String.valueOf(number).length();
        long sum = 0;
        while (number > 0) {
            long digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }
        return sum;
    }
}
