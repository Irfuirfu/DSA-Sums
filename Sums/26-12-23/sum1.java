public class Main {
    public static void main(String[] args) {
        int n = 5; 
        generateSeries(n);
    }
    private static void generateSeries(int n) {
        System.out.print("Series: ");
        int startingValue = 11;

        for (int i = 0; i < n; i++) {
            int term = startingValue * startingValue;
            System.out.print(term + " ");
            startingValue += 4; 
        }
    }
}
