public class Main {
    public static void main(String[] args) {
        int year = 2020; 

        char result = isLeapYear(year);
        System.out.println(result);
    }
    private static char isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return 'Y'; 
        } else {
            return 'N'; 
        }
    }
}
