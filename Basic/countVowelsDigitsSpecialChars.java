class countVowelsDigitsSpecialChars {
    public static void main(String[] args) {
        String a = "ddweioufbvaskwf@1784rgvkjs";
        int v = 0;
        int d = 0;
        int s = 0;
        char[] arr = a.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'e' || arr[i] == 'o' || arr[i] == 'u') {
                v++;
            } else if (Character.isDigit(arr[i])) {
                d++;
            } else if (!Character.isLetter(arr[i]) && !Character.isDigit(arr[i])) {
                s++;
            }
        }
        System.out.println(v + " " + d + " " + s);
    }
}