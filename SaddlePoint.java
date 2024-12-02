import java.util.Scanner;
class SaddlePoint{
    Scanner sc=new Scanner(System.in);
    int n;
    int A[][];
    void accept(){
        System.out.println("Enter the size of the square matrix.");
        n=sc.nextInt();
        A=new int[n][n];
        System.out.println("Enter "+(n*n)+" elements.");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                A[i][j]=sc.nextInt();
            }
        }
    }
    void locate(){
        int rowMin,colMax;
        boolean foundSaddlePoint=false;
        for(int i=0;i<n;i++){
            rowMin=A[i][0]; colMax=A[i][0];
            for(int j=0;j<n;j++){
                if(rowMin>A[i][j])  rowMin=A[i][j];
                for(int k=0;k<n;k++){
                    if(colMax<A[k][j])  colMax=A[k][j];
                }
                if(rowMin==colMax){
                    System.out.println("Saddle Point: "+rowMin);
                    foundSaddlePoint=true;  
                }
            }
        }
        if(!foundSaddlePoint)
            System.out.println("Saddle Point not Found!");
    }
    public static void main(String[]args){
        SaddlePoint obj=new SaddlePoint();
        obj.accept();
        obj.locate();
    }
}