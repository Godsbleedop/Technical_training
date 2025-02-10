import java.util.Scanner;
class main3{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number ");
        int n = sc.nextInt();
        System.out.println(fact(n));

    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int factorial = n*fact(n-1);
        return factorial;
    }
}
