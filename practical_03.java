import java.util.Scanner;

public class practical_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value in Meters : ");
        double meter = sc.nextDouble(); 
        double feet = meter * 3.28084;
        System.out.println(meter + " meters = "+feet+" feets");
        sc.close();
    }
}
