public class PangramChecker {
    public static void main(String[] args) {
        // it is not a Pangram. it dosen't contains all the alphabets from A to Z
        String input = "Java Assignment for Associate Software Engineer Role";
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Create a boolean array to mark the presence of each alphabet
        boolean[] alphabetPresent = new boolean[26];

        // Convert the input to lowercase for case-insensitive comparison
        input = input.toLowerCase();

        // Iterate through the input and mark the presence of each alphabet
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphabetPresent[c - 'a'] = true;
            }
        }

        // Check if all alphabets are present
        for (boolean present : alphabetPresent) {
            if (!present) {
                return false; // At least one alphabet is missing
            }
        }

        return true; // All alphabets are present
    }
}
