class Student {
    int id;
    String name;

    
    Student() {
        id = 0;
        name = "Unknown";
    }

    
    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID: " + id + " Name: " + name);
    }

    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student(101, "Ritwika");

        s1.display();
        s2.display();
    }
}