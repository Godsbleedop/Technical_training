// coin change problem 1,2,5,10,20,50,200,500,2000 
// find the minimum number of coin making the amount N ( the amount of we need to find ) 
import java.util.ArrayList;
import java.util.Scanner;
public class min_coin {
    public static void mincoins(int n) {
        int[] coins ={ 2000,500,100,50,20,5,2,1};
    ArrayList<Integer>result = new ArrayList<>(); // name of array list is result. We dont know the size of the array
     for( int coin:coins){    // 
        while(n>=coin){
            n-=coin;
            result.add(coin);
        }
 
    }
 System.out.println("minimum coins nedded "+result.size());
 System.out.println("coins are used"+result);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter amount");
    int n =sc.nextInt();
    mincoins(n);
}
} 
