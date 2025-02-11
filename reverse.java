// spy recieves secret message that is written backwards write a function that takes encoded message and writtens original message 

import java.util.Scanner;

class reverse {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the secret code : ");
        String passw=sc.nextLine();
        String r = "";
        char ch;

        for (int i = 0; i < passw.length(); i++) {
              
              
            ch = passw.charAt(i);
          
           
            r = ch + r; 
        }
      
        System.out.println("the code is " + r);
    }
}


/* or we can use this 
  import java.util.Scanner;
public class reverse1 {
    

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println(" ennter the secret code ");
String code = sc.nextLine();
StringBuffer stringbuff = new StringBuffer(code);
String rev =stringbuff.reverse().toString();
System.out.println("The reversed code is "+rev);
}
}
*/

