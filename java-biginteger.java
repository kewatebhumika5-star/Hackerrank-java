import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        
        // Addition
        BigInteger sum = a.add(b);
        
        // Multiplication
        BigInteger product = a.multiply(b);
        
        // Output
        System.out.println(sum);
        System.out.println(product);
        
        sc.close();
    }
}
