package Pattern;

public class Numeric {
    public static void main(String[] args) {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5 - row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row + 1; col++) {
                System.out.print(row + col + 1);
            }
            int start = 2 * row;
            for (int col = 1; col < row + 1; col++) {
                System.out.print(start);
                start--;
            }

            System.out.println();
        }
    }
}
