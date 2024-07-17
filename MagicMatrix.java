public class MagicMatrix {
    public static void main(String[] args) {
        int n = 5; 
        if (n % 2 == 0) {
            System.out.println("Size of the magic square should be odd");
            return;
        }
        
        int[][] magicSquare = generateMagicSquare(n);
        System.out.println("Magic Square of size " + n + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(magicSquare[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] generateMagicSquare(int n) {
        int[][] magicSquare = new int[n][n];

        int number = 1;
        int i = 0, j = n / 2;

        while (number <= n * n) {
            magicSquare[i][j] = number;
            number++;
            i--;
            j++;
            
            if (i < 0 && j == n) {
                i = 1;
                j = n - 1;
            } else if (i < 0) {
                i = n - 1;
            } else if (j == n) {
                j = 0;
            } else if (magicSquare[i][j] != 0) {
                i += 2;
                j--;
            }
        }

        return magicSquare;
    }
}

