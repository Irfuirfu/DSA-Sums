public class Main {
    public static void main(String[] args) {
        int number = 49;
        String result = checkMultipleOfSeven(number);
        System.out.println(result);
    }
    private static String checkMultipleOfSeven(int number) {
        if (number % 7 == 0) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
