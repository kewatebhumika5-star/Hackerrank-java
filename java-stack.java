import java.util.*;

class Solution {
    
    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String input = sc.next();
            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true;
            
            for (char ch : input.toCharArray()) {
                
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                } 
                else {
                   
                    if (stack.isEmpty()) {
                        isBalanced = false;
                        break;
                    }
                    
                    char top = stack.pop();
                    
                    if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                        isBalanced = false;
                        break;
                    }
                }
            }
            
          
            if (!stack.isEmpty()) {
                isBalanced = false;
            }
            
            System.out.println(isBalanced);
        }
    }
}
