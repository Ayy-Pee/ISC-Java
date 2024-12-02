import java.util.Scanner;
class MatrixRotation{
    int m,n;
    int A[][];
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        m=sc.nextInt(); n=sc.nextInt();
        A=new int[m][n];
        System.out.println("Enter the elements of the array.");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                A[i][j]=sc.nextInt();
            }
        }
    }
    void rotate(){
        int rotA[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==m-1)
                    rotA[i][j]=A[0][j];
                else
                    rotA[i][j]=A[i+1][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(rotA[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        MatrixRotation obj=new MatrixRotation();
        obj.accept();
        obj.rotate();
    }
}