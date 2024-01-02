public class Main {
    public static void main(String[] args) {
        int N = 3; 
        int L = 2;
        int R = 6; 
        String result = checkRange(N, L, R);
        System.out.println(result);
    }
    private static String checkRange(int N, int L, int R) {
        if (N >= L && N <= R) {
            return "yes";
        } else {
            return "no";
        }
    }
}
