package day3;

import java.util.*;

public class StringPrb {

    public static int CheckPassword(String str, int n) {

        // Condition 1: Length should be at least 4
        if (n < 4)
            return 0;
        // Condition 2: First character should not be a digit
        if (Character.isDigit(str.charAt(0)))
            return 0;
        boolean hasDigit = false;
        boolean hasCapital = false;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            if (ch == ' ' || ch == '/')
                return 0;

            if (Character.isDigit(ch))
                hasDigit = true;

            if (Character.isUpperCase(ch))
                hasCapital = true;

        }

        if (hasDigit && hasCapital)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String str = sc.nextLine();
        int result = CheckPassword(str, str.length());
        System.out.println("Output: " + result);

        sc.close();
    }
}