public class Main {
    public static void main(String[] args) {
       
        int n = 5; 
        generateSeries(n);
    }
    private static void generateSeries(int n) {
        System.out.print("Series: ");
        for (int i = 1; i <= n; i++) {
            int term = i * i;
            System.out.print(term + " ");
        }
    }
}
