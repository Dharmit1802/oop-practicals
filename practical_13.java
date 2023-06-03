import java.util.Scanner;
public class practical_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String string = sc.nextLine();
        String a = string.replace(" ", "");
        if(a.length()<3){
            System.out.println("Minimum 2 operand and 1 operator is required ....");
            System.exit(0);
        }
        int i = 0;
        int result = 0;
        while(a.charAt(i)!='+' && a.charAt(i)!='-' && a.charAt(i)!='*' && a.charAt(i)!='/'){
            i++;
        }
        switch(a.charAt(i)){
            case '+':
              result = Integer.parseInt(a.substring(0, i)) + Integer.parseInt(a.substring(i+1, a.length()));
              break;
            case '-':
              result = Integer.parseInt(a.substring(0, i)) - Integer.parseInt(a.substring(i+1, a.length()));
              break;
            case '*':
              result = Integer.parseInt(a.substring(0, i)) * Integer.parseInt(a.substring(i+1, a.length()));
              break;
            case '/':
              result = Integer.parseInt(a.substring(0, i)) / Integer.parseInt(a.substring(i+1, a.length()));
              break;  
        }
        System.out.println(a.substring(0, i) + " "+a.charAt(i)+" "+a.substring(i+1, a.length())+" = "+result);
        sc.close();
    }
}
