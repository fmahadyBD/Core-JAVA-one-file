import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the desired grid dimension:");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        System.out.println("Please enter the desired input:");
        int[][] grid = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        int[][] maxGrid = new int[rows][cols];
        int[][] minGrid = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0) {
                    maxGrid[i][j] = minGrid[i][j] = grid[i][j];
                } else {
                    int prevColumn = j - 1 < 0 ? 0 : j - 1;
                    int nextColumn = j + 1 >= cols ? cols - 1 : j + 1;

                    maxGrid[i][j] = grid[i][j] + Math.max(maxGrid[i - 1][prevColumn],
                            Math.max(maxGrid[i - 1][j], maxGrid[i - 1][nextColumn]));

                    minGrid[i][j] = grid[i][j] + Math.min(minGrid[i - 1][prevColumn],
                            Math.min(minGrid[i - 1][j], minGrid[i - 1][nextColumn]));
                }
            }
        }

        int highestTotal = Integer.MIN_VALUE;
        int lowestTotal = Integer.MAX_VALUE;

        for (int j = 0; j < cols; j++) {
            highestTotal = Math.max(highestTotal, maxGrid[rows - 1][j]);
            lowestTotal = Math.min(lowestTotal, minGrid[rows - 1][j]);
        }

        System.out.println("\nAnswer:");
        System.out.println("Highest: " + highestTotal);
        System.out.println("Lowest: " + lowestTotal);
        System.out.println("Thank you!!!");
    }
}