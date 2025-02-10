//customer support ticket id generation
// a customer suport system generates ticket id   in the format of TKT-<customer_name>-<random_number> the random number should be 1000-9999
import java.util.Random;
import java.util.Scanner;

class Rand{
public static void main(String [] args){
Scanner scanner = new Scanner(System.in);
Random random = new Random();

  int randomInt = random.nextInt(9999);
 System.out.println(" enter your name ");
 String name = scanner.nextLine();

 System.out.println(" your ticket is TKT-"+name+"-"+randomInt);
        
}
}
