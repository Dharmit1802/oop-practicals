import java.util.Scanner;
public class practical_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight in pound : ");
        double weight = sc.nextDouble();
        System.out.println("Enter your height in inches : ");
        double height = sc.nextDouble();
        double BMI = (weight * 0.45359237) / ((height * 0.0254)*(height * 0.0254));
        System.out.println("BMI = "+BMI);
        sc.close();
    }
}
