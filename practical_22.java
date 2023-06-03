import java.util.Scanner;
class practical_22{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[5];
        int product = 1;
        System.out.print("Enter five element : ");
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
            product*=list[i];
        }
        System.out.print("Product of Array element is "+product);
    }
}