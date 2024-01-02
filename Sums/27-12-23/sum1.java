public class Main {
    public static void main(String[] args) {
       
        long number = 1234; 
        long result = calculateSumOfDigitsPower(number);
        System.out.println("Output: " + result);
    }
    private static long calculateSumOfDigitsPower(long number) {
        int numDigits = String.valueOf(number).length();
        long sum = 0;
        for (; number > 0; number /= 10) {
            int digit = (int) (number % 10);
            sum += Math.pow(digit, numDigits);
        }

        return sum;
    }
}
