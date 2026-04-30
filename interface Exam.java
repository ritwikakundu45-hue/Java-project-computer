interface Exam {
    void percent_cal();
}

class Student {
    String name;
    int rollNo;
    double marks1, marks2;

    void getData(String name, int rollNo, double m1, double m2) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks1 = m1;
        this.marks2 = m2;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
    }
}

// Result Class
class Result extends Student implements Exam {
    double per;

    // Implement interface method
    public void percent_cal() {
        per = (marks1 + marks2) / 2;
    }

    void display() {
        show();
        System.out.println("Percentage: " + per + "%");
    }
}

public class Main {
    public static void main(String[] args) {
        Result r = new Result();

        r.getData("Riya", 101, 85, 90);
        r.percent_cal();
        r.display();
    }
}