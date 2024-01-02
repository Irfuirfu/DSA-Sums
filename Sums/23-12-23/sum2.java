public class Main {
    public static void main(String[] args) {
        int number = 59; 
        String result = checkGreatNumber(number);
        System.out.println(result);
    }
    private static String checkGreatNumber(int number) {
        int digit1 = number / 10;
        int digit2 = number % 10;
        int sum = digit1 + digit2;
        int product = digit1 * digit2;
        if (sum + product == number) {
            return "Great";
        } else {
            return "No";
        }
    }
}
