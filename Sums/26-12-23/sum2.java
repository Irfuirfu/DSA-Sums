public class Main {
    public static void main(String[] args) {
        double secondTerm = 2; // Provide the second term here
        double thirdTerm = 4; // Provide the third term here
        int totalTerms = 4;    // Provide the total number of terms here

        double result = calculateGpSum(secondTerm, thirdTerm, totalTerms);

        System.out.printf("Output: %.3f\n", result);
    }

    private static double calculateGpSum(double secondTerm, double thirdTerm, int totalTerms) {
        double commonRatio = thirdTerm / secondTerm;

        double sum = secondTerm * (1 - Math.pow(commonRatio, totalTerms)) / (1 - commonRatio);

        return sum;
    }
}
