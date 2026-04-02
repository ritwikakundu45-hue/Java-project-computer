import java.util.Scanner;

class Item {
    int code;
    double price;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter code: ");
        code = sc.nextInt();
        System.out.print("Enter price: ");
        price = sc.nextDouble();
    }

    void display() {
        System.out.println(code + "\t" + price);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Item[] items = new Item[5];
        double total = 0;

        for (int i = 0; i < 5; i++) {
            items[i] = new Item();
            items[i].input();
            total += items[i].price;
        }

        System.out.println("\nCode\tPrice");
        for (Item i : items) {
            i.display();
        }

        System.out.println("Total Price = " + total);
    }
}