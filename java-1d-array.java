import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        return solve(0, leap, game);
    }

    private static boolean solve(int i, int leap, int[] game) {

        if (i >= game.length) return true;   // win
        if (i < 0 || game[i] == 1) return false; // invalid move

        game[i] = 1; // mark visited

        return solve(i + leap, leap, game) ||
               solve(i + 1, leap, game) ||
               solve(i - 1, leap, game);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}
