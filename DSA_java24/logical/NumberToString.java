import java.util.Scanner;

public class NumberToString {
    
    // Method to convert a digit to its string representation
    public static String numberToString(int digit) {
        switch (digit) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "Only Integer Value is allowed";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value you want: ");
        String input = scanner.nextLine();
        scanner.close();
        
        StringBuilder mergedString = new StringBuilder();
        
        // Convert each digit to its string representation
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                mergedString.append(numberToString(digit)).append(" ");
            }
        }
        
        // Print the merged string
        System.out.println(mergedString.toString().trim()); // Remove trailing whitespace
    }
}

