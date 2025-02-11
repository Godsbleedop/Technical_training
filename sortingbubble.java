/* sorting score of a small class
  a teacher wants to solve the exam scores of a small class in acsending order to indentify  the top performers */
import java.util.Scanner;
public class bubble {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    int n = arr.length;
    System.out.println("Enter 5 numbers:");
    for(int i =0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    System.out.println(" the sorted array is ");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    }
}
    
