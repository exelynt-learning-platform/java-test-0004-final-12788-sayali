public class ConcentricPattern {
    public static void main(String[] args) {
        int n = 4; // The starting maximum number
        int size = 2 * n - 1; // Total rows and columns (7x7)

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                
                // Calculate distance from all four edges
                int top = i;
                int left = j;
                int bottom = size - i + 1;
                int right = size - j + 1;

                // The value at (i, j) is the minimum distance to any edge,
                // adjusted to start from the maximum value 'n'.
                int minDistance = Math.min(Math.min(top, bottom), Math.min(left, right));
                
                // Logic: Start from n and decrease as we move toward the center
                System.out.print((n - minDistance + 1) + " ");
            }
            // Move to the next line after completing a row
            System.out.println();
        }
    }
}