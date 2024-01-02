public class Main {
    public static void main(String[] args) {
        int rows = 4;
        printInvertedPyramid(rows);
    }
    private static void printInvertedPyramid(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (rows - i) - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
