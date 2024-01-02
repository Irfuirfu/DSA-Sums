public class Main {
    public static void main(String[] args) {
        int N = 5; 
        printMultiples(N);
    }
private static void printMultiples(int N) {
        System.out.println("First 3 multiples of " + N + ":");
        for (int i = 1; i <= 3; i++) {
            int multiple = N * i;
            System.out.println(multiple);
        }
    }
}
