/*
Problem: Move all occurrences of 'x' to the end of the string
Approach: Recursion with counter and StringBuilder
Time Complexity: O(n)
Space Complexity: O(n) (recursion stack)
*/

public class Main {
    public static void xAtEnd(String s, int i, int ctr, StringBuilder str) {
        if(i == s.length()) {
            while(ctr >= 1) {
                str.append('x');
                ctr--;
            }
            return;
        }
        if(s.charAt(i) == 'x') {
            ctr++;
        }
        else {
            str.append(s.charAt(i));
        }
        xAtEnd(s, i+1, ctr, str);
    }
    public static void main(String args[]) {
        String s = "axbcxxd";
        StringBuilder str = new StringBuilder();
        xAtEnd(s, 0, 0, str);
        System.out.println(str);
    }
}
