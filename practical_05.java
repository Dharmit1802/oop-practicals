import java.util.Scanner;

public class practical_05 {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter integer 2 : ");
        int b = sc.nextInt();
        if(a<b){
            temp = a;
            a=b;
            b= temp;
        }
        System.out.println("Enteer integer 3 : ");
        int c = sc.nextInt();
        if(c>b){
            if(c>a){
                temp = c;
                c = b;
                b = a;
                a = temp;
            }
            else{
                temp = c;
                c = b;
                b = temp;
            }
        }

        System.out.println("Decreasing order : "+a+" "+b+" "+c);
        sc.close();
    }
}
