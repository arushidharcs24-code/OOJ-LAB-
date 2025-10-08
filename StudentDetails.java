import java.util.Scanner;

class Student {
    String usn;
    String name;
    int[] credits;
    int[] marks;
    int subjects;
    void acceptDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter USN: ");
        usn = scanner.nextLine();

        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        System.out.print("Enter number of subjects: ");
        subjects = scanner.nextInt();

        credits = new int[subjects];
        marks = new int[subjects];

        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter credits for subject " + (i + 1) + ": ");
            credits[i] = scanner.nextInt();

            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }


    void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Subjects: " + subjects);
        for (int i = 0; i < subjects; i++) {
            System.out.println("Subject " + (i + 1) + " - Credits: " + credits[i] + ", Marks: " + marks[i]);
        }
    }

   
    void calculateSGPA() {
        int totalCredits = 0;
        int GradePoints = 0;

        for (int i = 0; i < subjects; i++) {
            int gradePoint = getGradePoint(marks[i]);
            GradePoints += gradePoint * credits[i];
            totalCredits += credits[i];
        }

        double sgpa = (double) GradePoints / totalCredits;
        System.out.printf("SGPA: %.2f\n", sgpa);
    }

    
    int getGradePoint(int marks) {
        if (marks >= 90) return 10;
        else if (marks >= 80) return 9;
        else if (marks >= 70) return 8;
        else if (marks >= 60) return 7;
        else if (marks >= 50) return 6;
        else if (marks >= 40) return 5;
        else return 0; 
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Student student = new Student();
        student.acceptDetails();
        student.displayDetails();
        student.calculateSGPA();
    }
}
