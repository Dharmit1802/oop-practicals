public class practical_11 {
    public static int[][] FillMatrix(){
        int matrix[][] = new int[6][6];
        for(int i=0; i<6;i++){
            for(int j=0;j<6;j++){
                matrix[i][j]=(int)((Math.random()*5)%2);
            }
        }
        return matrix;
    }

    public static void ShowMatrix(int a[][]){
         for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
         }
    }

    public static void main(String[] args) {
        int mymatrix[][];
        int i,j,count;
        mymatrix = FillMatrix();
        System.out.println("Filled matrix : ");
        ShowMatrix(mymatrix);
        for ( i = 0; i < mymatrix.length; i++) {
            count = 0;
            for ( j = 0; j < mymatrix.length; j++) {
                if(mymatrix[i][j]==1){
                    count++;
                }
            }
            if((count%2)!=0){
                System.out.println("Row "+(i+1)+" have odd number 1's...");
            }
        }
        for ( i = 0; i < mymatrix.length; i++) {
            count = 0;
            for ( j = 0; j < mymatrix.length; j++) {
                if(mymatrix[j][i]==1){
                    count++;
                }
            }
            if((count%2)!=0){
                System.out.println("column "+(i+1)+" have odd number 1's...");
            }
        }
    }
}
