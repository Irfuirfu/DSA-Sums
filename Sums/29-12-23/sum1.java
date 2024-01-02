public class Main {
    public static void main(String[] args) {
        int number = 10; 
        String result = checkOddEven(number);
        System.out.println(number + " is " + result);
    }
    private static String checkOddEven(int number) {
        if ((number & 1) == 1) {
            return "odd";
        } else {
            return "even";
        }
    }
}
