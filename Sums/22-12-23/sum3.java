public class Main {
    public static void main(String[] args) {
        int N = 5; 
        long factorial = calculateFactorial(N);
        System.out.println("Factorial of " + N + ": " + factorial);
    }
    private static long calculateFactorial(int N) {
        long factorial = 1;
        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
