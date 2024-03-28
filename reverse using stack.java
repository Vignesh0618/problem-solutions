Given a number , write a program to reverse this number using stack.
Examples: 
Input : 365
Output : 563

Input : 6899
Output : 9986

  .......................................................................?????????????????????
  CODE:...............

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack<Integer> st = new Stack<>();
        while (n != 0) {
            st.push(n % 10);
            n /= 10;
        }
        Stack<Integer> ans = new Stack<>();
        while (!st.empty()) {
            ans.push(st.peek());
            st.pop();
        }
        while (!ans.empty()) {
            System.out.print(ans.peek());
            ans.pop();
        }
    }
}


