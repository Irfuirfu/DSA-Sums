public class Main {
    public static void main(String[] args) {
        char character = 'a'; 
        boolean isVowel = checkVowel(character);

        if (isVowel) {
            System.out.println(character + " is a vowel.");
        } else {
            System.out.println(character + " is not a vowel.");
        }
    }
    private static boolean checkVowel(char character) {
        String vowels = "aeiou";
        return vowels.contains(String.valueOf(character));
    }
}
