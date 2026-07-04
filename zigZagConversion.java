class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        int currRows = 0;
        boolean goingDown = false;
        for (char c : s.toCharArray()) {
            rows[currRows].append(c);
            if (currRows == 0 || currRows == numRows - 1) {
                goingDown = !goingDown;
            }
            currRows += goingDown ? 1 : -1;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) {
            res.append(row);
        }
        return res.toString();
    }
}