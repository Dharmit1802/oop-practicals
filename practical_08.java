import java.util.Scanner;

public class practical_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number : ");
        int num = sc.nextInt();
        sc.close();
        int div = 2;
        while(num > 1){
            if(num%div == 0){
                System.out.print(div+",");
                num = num/div;
            }
            else 
              div++;
        }
    }
}
