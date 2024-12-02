import java.util.Scanner;
class DoublyMarkov{
    Scanner sc=new Scanner(System.in);
    int n;
    double arr[][];
    void sizeAccept(){
        System.out.println("Enter thes size of the Array.");
        n=sc.nextInt();
        while(n<3 || n>9){
            System.out.println("The size has to between 3 & 9. Try Again.");
            n=sc.nextInt();
        }
    }
    void arrAccept(){
        System.out.println("Enter "+(n*n)+" elements.");
        arr=new double[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextDouble();
                while(arr[i][j]<0){
                    System.out.println("Elements of the Matrix must be positive. Try Again.");
                    arr[i][j]=sc.nextDouble();
                }
            }
        }
    }
    boolean check(){
        boolean flag=true;
        double rowSum=0, colSum=0;
        for(int i=0;i<n;i++){
            rowSum=0; colSum=0;
            for(int j=0;j<n;j++){
                rowSum+=arr[i][j];
                colSum+=arr[j][i];
            }
            if(rowSum!=1||colSum!=1){
                flag=false;
                break;
            }
        }
        return flag;
    }
    void display(){
        if(check())
            System.out.println("The matrix is Doubly Markov Matrix.");
        else
            System.out.println("The matrix is not a Doubly Markov Matrix.");
    }
    public static void main(String[]args){
        DoublyMarkov obj=new DoublyMarkov();
        obj.sizeAccept();
        obj.arrAccept();
        obj.display();
    }
}