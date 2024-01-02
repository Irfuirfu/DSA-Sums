public class Main {
    public static void main(String[] args) {
        int n = 5; 
        generateSeries(n);
    }
    private static void generateSeries(int n) {
        System.out.print("Series: ");
        int term = 31;

        for (int i = 0; i < n; i++) {
            System.out.print(term + " ");

            if (i % 2 == 0) {
                term -= 2;
            } else {
                term -= 5;
            }
        }
    }
}
