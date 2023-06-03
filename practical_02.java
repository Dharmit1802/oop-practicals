import java.util.Scanner;

public class practical_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Values from equation - 1 :");
        System.out.println("Enter the value of a :");
        double a = sc.nextDouble();
        System.out.println("Enter the value of b :");
        double b = sc.nextDouble();
        System.out.println("Enter the value of e :");
        double e = sc.nextDouble();

        System.out.println("Values from equation - 2 :");
        System.out.println("Enter the value of c :");
        double c = sc.nextDouble();
        System.out.println("Enter the value of d :");
        double d = sc.nextDouble();
        System.out.println("Enter the value of f :");
        double f = sc.nextDouble();

        double x = ((e * d) - (b * f))/((a * d) - (b * c));
        double y = ((a * f) - (e * c))/((a * d) - (b * c));

        System.out.println("X = "+x+" y = "+y);
        sc.close();
    }
}
