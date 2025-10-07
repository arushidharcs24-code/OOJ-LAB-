import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        float fInput = sc.nextFloat();
        int sum = a + b;
        int diff = Math.abs(a - b);
        int prod = a * b;
        float div = (float) a / b;

        System.out.println("Result of addition is " + sum);
        System.out.println("Result of multiplication is " + prod);
        System.out.println("Result of division is " + div);
        System.out.println("Result of subtraction is " + diff);
    }}