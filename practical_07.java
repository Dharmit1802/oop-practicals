public class practical_07 {
    public static void main(String[] args) {
        int ch1 = 'A' + (int)(Math.random()*('Z'-'A'));
        int ch2 = 'A' + (int)(Math.random()*('Z'-'A'));
        int ch3 = 'A' + (int)(Math.random()*('Z'-'A'));

        int a1 = (int)(Math.random()*10);
        int a2 = (int)(Math.random()*10);
        int a3 = (int)(Math.random()*10);
        int a4 = (int)(Math.random()*10);

        System.out.println(""+(char)ch1+(char)ch2+(char)ch3+a1+a2+a3+a4);
    }
}
