import java.util.Scanner;

public class Student {
    
    private String usn;
    private String name;
    private int marks1, marks2, marks3;

    public Student(String usn, String name, int marks1, int marks2, int marks3) {
        this.usn = usn;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public double computeAverage() {
        return (marks1 + marks2 + marks3) / 3.0;
    }

    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.printf("Average Marks: %.2f\n", computeAverage());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter USN: ");
        String usn = scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Marks 1: ");
        int marks1 = scanner.nextInt();

        System.out.print("Enter Marks 2: ");
        int marks2 = scanner.nextInt();

        System.out.print("Enter Marks 3: ");
        int marks3 = scanner.nextInt();

        Student student = new Student(usn, name, marks1, marks2, marks3);
        student.displayDetails();

        scanner.close();
    }
}
