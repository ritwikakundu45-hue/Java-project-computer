interface SalesDepartment {
    void processSale(double amount);
}

// FinanceDepartment Interface
interface FinanceDepartment {
    void generateInvoice(String clientName, double amount);
}

class CommercialExecutive implements SalesDepartment, FinanceDepartment {

    double lastSaleAmount;
    String lastClient;

    public void processSale(double amount) {
        lastSaleAmount = amount;
        System.out.println("Sale processed for amount: " + amount);
    }

    public void generateInvoice(String clientName, double amount) {
        lastClient = clientName;
        System.out.println("Invoice generated for client: " + clientName);
        System.out.println("Invoice Amount: " + amount);
    }

    void showSummary() {
        System.out.println("\n--- Summary ---");
        System.out.println("Last Client: " + lastClient);
        System.out.println("Last Sale Amount: " + lastSaleAmount);
        System.out.println("Operations completed successfully.");
    }
}

public class CommercialSystem {
    public static void main(String[] args) {
        CommercialExecutive exec = new CommercialExecutive();

        exec.processSale(10000);
        exec.generateInvoice("ABC Pvt Ltd", 10000);
        exec.showSummary();
    }
}