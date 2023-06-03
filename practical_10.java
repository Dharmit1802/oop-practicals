import java.util.Scanner;
public class practical_10 {

    public static void reverse(int a[]){
        int temp,j=0;
        while(j<a.length/2){
            temp = a[j];
            a[j] = a[a.length - 1 -j];
            a[a.length - 1 -j] = temp;
            j++;
        }
    }
    public static void main(String[] args) {
        int a[] = new int[10];
        int i = 0;
        Scanner sc = new Scanner(System.in);
        for(i = 0 ; i<10 ; i++){
            System.out.print("Enter element "+(i+1)+" : ");
            a[i] = sc.nextInt();
        }
        sc.close();
        
        reverse(a);
        System.out.println("After reversing array : ");
        for(i = 0 ; i<10 ; i++){
            System.out.println("Element at "+(i+1)+" : "+a[i]);
        }
        
    }
}
