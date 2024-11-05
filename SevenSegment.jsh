public class SevenSegment {
    // Method to return the string representing each segment of the digit
    public static String ssd(int d, int n) {
        switch ((d * 10) + n) {
            case 1: case 5: case 21: case 23: case 25: case 31: case 33: case 35:
            case 43: case 51: case 53: case 55: case 61: case 63: case 65: case 71:
            case 81: case 83: case 85: case 91: case 93: case 95:
                return " --  ";
            case 24: case 52: case 62:
                return "|    ";
            case 12: case 14: case 22: case 32: case 34: case 44: case 54: case 72:
            case 74: case 94:
                return "   | ";
            case 2: case 4: case 42: case 64: case 82: case 84: case 92:
                return "|  | ";
            default: return "     ";
        }
    }
    // Display method that shows the 7-segment display of the number
    public static void display(int n) {
        String[] lines = new String[5]; // Array to hold 5 lines for ASCII art        
        // Initialize the lines array with empty strings
        for (int i = 0; i < 5; i++) {
            lines[i] = "";
        }        
        // Process each digit of the number from left to right
        String numStr = Integer.toString(n); // Convert number to string for easy iteration       
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            // Append the corresponding segment for each line for the current digit
            for (int row = 0; row < 5; row++) {
                lines[row] += ssd(digit, row + 1); // Add the ASCII art of the current digit to the line
            }
        }
        // Print the final result by printing each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
