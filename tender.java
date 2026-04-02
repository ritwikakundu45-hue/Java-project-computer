import java.util.Scanner;

class Tender {
    double cost;
    String company;

    void getData(Scanner sc) {
        System.out.print("Enter company name: ");
        company = sc.next();
        System.out.print("Enter cost: ");
        cost = sc.nextDouble();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tender[] t = new Tender[5];

        for (int i = 0; i < 5; i++) {
            t[i] = new Tender();
            t[i].getData(sc);
        }

        double min = t[0].cost;
        String minCompany = t[0].company;

        for (int i = 1; i < 5; i++) {
            if (t[i].cost < min) {
                min = t[i].cost;
                minCompany = t[i].company;
            }
        }

        System.out.println("Company with minimum cost: " + minCompany);
    }
}
