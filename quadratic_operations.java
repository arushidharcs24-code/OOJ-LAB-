import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        float a = input.nextFloat();

        System.out.print("Enter coefficient b: ");
        float b = input.nextFloat();

        System.out.print("Enter coefficient c: ");
        float c = input.nextFloat();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("The roots are %.2f and %.2f\n", root1, root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.printf("The root is %.2f\n", root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.printf("The roots are %.2f + %.2fi and %.2f - %.2fi\n", realPart, imaginaryPart, realPart, imaginaryPart);
        }

        input.close();
    }
}