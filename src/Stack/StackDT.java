package Stack;

import java.util.Stack;

public class StackDT {
    public static void main(String[] args) {
        
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("hello"));

    }

    public static boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        String r = "";

        while (!stack.isEmpty()) {
            r += stack.pop();
        }

        return r.equals(s);
    }
}
