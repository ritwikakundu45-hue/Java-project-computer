import java.util.*;

// Interface Department
interface Department {
    String deptName = "Computer Science";
    String deptHead = "Dr. Sharma";

    void printDeptDetails();
}

// Hostel class
class Hostel {
    protected String hostelName;
    protected String hostelLocation;
    protected int numberOfRooms;

    public void getHostelData(Scanner sc) {
        System.out.print("Enter Hostel Name: ");
        hostelName = sc.nextLine();

        System.out.print("Enter Hostel Location: ");
        hostelLocation = sc.nextLine();

        System.out.print("Enter Number of Rooms: ");
        numberOfRooms = sc.nextInt();
        sc.nextLine(); // clear buffer
    }

    public void printHostelData() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + numberOfRooms);
    }
}

// Student class
class Student extends Hostel implements Department {
    private String studentName;
    private String regdNo;
    private String electiveSubject;
    private double avgMarks;

    public void getData(Scanner sc) {
        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter Registration Number: ");
        regdNo = sc.nextLine();

        System.out.print("Enter Elective Subject: ");
        electiveSubject = sc.nextLine();

        System.out.print("Enter Average Marks: ");
        avgMarks = sc.nextDouble();
        sc.nextLine();

        // Get hostel data
        getHostelData(sc);
    }

    public void printData() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + studentName);
        System.out.println("Registration No: " + regdNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);

        printHostelData();
        printDeptDetails();
    }

    public String getRegdNo() {
        return regdNo;
    }

    // Implement interface method
    public void printDeptDetails() {
        System.out.println("Department Name: " + deptName);
        System.out.println("Department Head: " + deptHead);
    }
}

// Driver class
public class Profile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Admit New Student");
            System.out.println("2. Migrate a Student");
            System.out.println("3. Display Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Student s = new Student();
                    s.getData(sc);
                    students.add(s);
                    System.out.println("Student admitted successfully!");
                    break;

                case 2:
                    System.out.print("Enter Registration Number to migrate: ");
                    String regNo = sc.nextLine();
                    boolean found = false;

                    for (Student st : students) {
                        if (st.getRegdNo().equals(regNo)) {
                            students.remove(st);
                            System.out.println("Student migrated (removed) successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 3:
                    if (students.isEmpty()) {
                        System.out.println("No student records found.");
                    } else {
                        for (Student st : students) {
                            st.printData();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}