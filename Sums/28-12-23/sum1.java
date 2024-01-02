public class Main {
    public static void main(String[] args) {
        int n = 3; 
        printNumberPattern(n);
    }
    private static void printNumberPattern(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= Math.abs(n - i); j++) {
                System.out.print("  ");
            }
            int limit = (i <= n) ? i : 2 * n - i;
            for (int k = 1; k <= limit; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
