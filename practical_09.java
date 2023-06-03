import java.util.Scanner;
public class practical_09 {
    public static int gcd(int num1,int num2){
        while(num1!=num2){
            if(num1>num2){
                num1 = num1 - num2;
            }
            else{
                num2 = num2 - num1;
            }
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();
        System.out.println("GCD of "+num1+" and "+num2+" is = "+gcd(num1,num2));
        sc.close();
    }
}
