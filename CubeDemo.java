import java.util.Scanner;

class Cube {
    
    private double length;
    private double breadth;
    private double height;

   
    public void readDimensions() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        length = scanner.nextDouble();

        System.out.print("Enter breadth: ");
        breadth = scanner.nextDouble();

        System.out.print("Enter height: ");
        height = scanner.nextDouble();
    }

    // Method to calculate volume
    public double calculateVolume() {
        return length * breadth * height;
    }

    // Method to display volume
    public void displayVolume() {
        System.out.println("The volume of the cube is: " + calculateVolume());
    }
}

public class CubeDemo {
public static void main(String[] args) {
        // Create an object of Cube
        Cube cube = new Cube();

        // Read dimensions
        cube.readDimensions();

        // Display the volume
        cube.displayVolume();
    }
}
