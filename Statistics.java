
import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int upper = 0, lower = 0, digits = 0, spaces = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) upper++;
            else if (Character.isLowerCase(ch)) lower++;
            else if (Character.isDigit(ch)) digits++;
            else if (Character.isWhitespace(ch)) spaces++;
        }

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
    }
}