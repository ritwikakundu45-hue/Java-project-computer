interface Gross {
    void calculateGross();
}

class Employee {
    String name;
    int empId;

    void getEmployeeDetails(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
    }
}

class Salary extends Employee implements Gross {
    double basic, hra, da, grossSalary;

    void getSalaryDetails(double basic) {
        this.basic = basic;
        hra = 0.2 * basic;
        da = 0.1 * basic;
    }

    public void calculateGross() {
        grossSalary = basic + hra + da;
    }

    void displaySalaryDetails() {
        displayEmployeeDetails();
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Salary emp = new Salary();

        emp.getEmployeeDetails("Rahul", 201);
        emp.getSalaryDetails(20000);

        emp.calculateGross();
        emp.displaySalaryDetails();
    }
}