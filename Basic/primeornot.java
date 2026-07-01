package Basic;

import java.util.*;

public class primeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println(false);
            return;
        }
        if (n == 2) {
            System.out.println(true);
            return;
        }
        if (n % 2 == 0) {
            System.out.println(false);
            return;
        }

    }
}
