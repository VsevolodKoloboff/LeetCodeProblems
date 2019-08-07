package tasks;

import java.util.HashMap;
import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.*/

public class ValidParentheses_20 {

    private HashMap<Character, Character> mappings;

    public ValidParentheses_20() {
            this.mappings =new HashMap<Character, Character>();
            this.mappings.put(')', '(');
            this.mappings.put('}', '{');
            this.mappings.put(']', '[');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i=0; i< s.length(); i++) {
            char c = s.charAt(i);

            if (this.mappings.containsKey(c)){
                char topElement = stack.empty() ? '#' : stack.pop();

                if (topElement != this.mappings.get(c))
                    return false;
            } else
                stack.push(c);
        }
        return stack.isEmpty();
    }

    /*main*/
    public static void main(String[] args) {
        ValidParentheses_20 main = new ValidParentheses_20();
        System.out.println(main.isValid("[]()[)]"));
        System.out.println(main.isValid("[]()[]{}"));
    }
}
