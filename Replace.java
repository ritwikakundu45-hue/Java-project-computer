import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        str = str.replace('d', 'f');

        System.out.println("Modified string: " + str);
    }
}
