package stack;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == '(' || a[i] == '{' || a[i] == '[') {
                st.push(a[i]);
            } else {
                if (st.isEmpty())
                    return false;
                char top = st.pop();
                if (a[i] == ')' && top != '(' || a[i] == '}' && top != '{' || a[i] == ']' && top != '[')
                    return false;
                ;
            }
        }
        return st.isEmpty();
    }
}