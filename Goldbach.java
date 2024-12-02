import java.util.Scanner;
class Goldbach{
    Scanner sc=new Scanner(System.in);
    int n;
    void accept(){
        System.out.println("Enter a even number from 4 to 50.");
        n=sc.nextInt();
        while(n<4 || n>50 || n%2!=0){
            System.out.println("Invalid input! Try again!");
            n=sc.nextInt();
        }
    }
    boolean isPrime(int x){
        boolean flag=true;
        if(x==1)
            flag=false;
        for(int i=2;i<x/2;i++){
            if((x%i)==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
    void display(){
        int X=0, Y=n;
        while(X<=n/2){
            if(X+Y==n && isPrime(X) && isPrime(Y))
                System.out.println("("+X+","+Y+")");
            X++; Y--;
        }
    }
    public static void main(String[]args){
        Goldbach obj=new Goldbach();
        obj.accept();
        obj.display();
    }
}