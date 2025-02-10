//  write a programm to check if string is palindrome
// a palindrime is a word that reads the same forward and backward
// input is racecar

import java.util.Scanner;
class palindrome{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println(" enter the string ");
String name = sc.nextLine();
StringBuffer stringbuff = new StringBuffer(name);
String rev =stringbuff.reverse().toString();
System.out.println(" the string is "+rev);
if(rev.equals(name)){
System.out.println(" the string is coorect");
}
else{
System.out.println(" not a palindrome");
}
}
}
