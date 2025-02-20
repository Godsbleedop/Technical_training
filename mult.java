import java.util.Scanner;
class mult{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" enter the number you need multiplication table ");
     int n= s.nextInt();
     for( int i=1;i<=20;i++){
        System.out.println(n+"*"+i+"="+n*i);
     }
     s.close();
}
}
