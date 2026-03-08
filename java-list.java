import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        int q = sc.nextInt();

        for(int i = 0; i < q; i++){
            String query = sc.next();

            if(query.equals("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();
                list.add(x, y);
            }
            else if(query.equals("Delete")){
                int x = sc.nextInt();
                list.remove(x);
            }
        }

        for(int num : list){
            System.out.print(num + " ");
        }

        sc.close();
    }
}
