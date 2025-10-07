import java.util.Scanner;

public class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;
    private String designation;
    
    private static int count = 0;
   
    public Employee() {
        count++; 
    }
    
    public Employee(int id, String name, String department, double salary, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.designation = designation;
        count++; 
    }
  
    public void readEmployee() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Employee ID: ");
        this.id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.print("Enter Employee Name: ");
        this.name = scanner.nextLine();
        
        System.out.print("Enter Department: ");
        this.department = scanner.nextLine();
        
        System.out.print("Enter Salary: ");
        this.salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        
        System.out.print("Enter Designation: ");
        this.designation = scanner.nextLine();
        
        System.out.println(); 
    }
    
    
    public void displayEmployee() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Designation: " + designation);
        System.out.println("---------------------------");
    }
    
    public static int getEmployeeCount() {
        return count;
    }
    
  
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public String getDesignation() {
        return designation;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== EMPLOYEE MANAGEMENT SYSTEM ===");
        System.out.print("How many employees do you want to create? ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        Employee[] employees = new Employee[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\n=== Enter details for Employee " + (i + 1) + " ===");
            employees[i] = new Employee();
            employees[i].readEmployee();
        }
        
       
        System.out.println("\n=== EMPLOYEE DETAILS ===");
        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            employees[i].displayEmployee();
        }
        
    
        System.out.println("Total number of Employee objects created: " + Employee.getEmployeeCount());
        
      
        System.out.print("\nDo you want to create more employees? (yes/no): ");
        String choice = scanner.nextLine().toLowerCase();
        
        if (choice.equals("yes") || choice.equals("y")) {
            System.out.print("How many additional employees? ");
            int additional = scanner.nextInt();
            scanner.nextLine(); 
            Employee[] allEmployees = new Employee[n + additional];
            
        
            for (int i = 0; i < n; i++) {
                allEmployees[i] = employees[i];
            }
            
          
            for (int i = n; i < n + additional; i++) {
                System.out.println("\n=== Enter details for Additional Employee " + (i - n + 1) + " ===");
                allEmployees[i] = new Employee();
                allEmployees[i].readEmployee();
            }
            
          
            System.out.println("\n=== ALL EMPLOYEE DETAILS ===");
            for (int i = 0; i < n + additional; i++) {
                System.out.println("Employee " + (i + 1) + ":");
                allEmployees[i].displayEmployee();
            }
                    System.out.println("Final total number of Employee objects created: " + Employee.getEmployeeCount());
        }
        
       
        System.out.print("\nDo you want to search for an employee by ID? (yes/no): ");
        String searchChoice = scanner.nextLine().toLowerCase();
        
        if (searchChoice.equals("yes") || searchChoice.equals("y")) {
            System.out.print("Enter Employee ID to search: ");
            int searchId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            boolean found = false;
            for (Employee emp : employees) {
                if (emp.getId() == searchId) {
                    System.out.println("\nEmployee Found!");
                    emp.displayEmployee();
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                System.out.println("Employee with ID " + searchId + " not found.");
            }
        }
        
       
    }
}