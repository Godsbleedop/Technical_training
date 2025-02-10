// a machine has 10 sensors that give temperature readings .  the normal 20-40 degree celcius , but if any sensor gives a readding above 50 degree celcius there might a fault 
// 25,30,28,55,32,29
import java.util.Scanner;

class Fault{
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 int arr[] = new int[6];
System.out.println(" enter the array");
 for(int i=0;i<6;i++){
  arr[i] = sc.nextInt();
 }
 for(int i=0;i<6;i++){
  System.out.println(" the array is "+arr[i]);
 } 
 for( int i=0;i<6;i++){
   if(arr[i]>50){
   System.out.println(" the value of the sensor is incorrect "+i);
   
   }
   else{
   System.out.println(" the sensor values are correct at  "+i);
   }
 sc.close();
 }
}
   }
