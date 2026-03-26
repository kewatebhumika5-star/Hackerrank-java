import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Deque<Integer> deque = new ArrayDeque<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int n = in.nextInt();
        int m = in.nextInt();

        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            // Add element
            deque.addLast(num);

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }

            // Maintain window size
            if (deque.size() > m) {
                int removed = deque.removeFirst();

                map.put(removed, map.get(removed) - 1);

                if (map.get(removed) == 0) {
                    map.remove(removed);
                }
            }

            // Update answer
            if (deque.size() == m) {
                maxUnique = Math.max(maxUnique, map.size());
            }
        }

        System.out.println(maxUnique);
    }
}
