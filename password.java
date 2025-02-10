// password length more than 5 less than 15
// the characters of a-z and A-Z      

import java.util.Scanner;
class palindrome{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println(" enter the string ");
String name = sc.nextLine();
StringBuffer stringbuff = new StringBuffer(name);
String rev =stringbuff.toString();
