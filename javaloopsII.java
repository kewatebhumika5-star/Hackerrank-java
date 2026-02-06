import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();   // number of queries

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = a;

            for (int j = 0; j < n; j++) {
                sum += (1 << j) * b;   // 2^j * b
                System.out.print(sum + " ");
            }
            System.out.println();  // new line after each query
        }

        in.close();
    }
}
