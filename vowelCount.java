// write a programm that takes string as a input and counts the number of vowels and consonants 
// input hello world 
import java.util.Scanner;

class Vowels{
 public static void main(String[] args ){
  Scanner sc = new Scanner(System.in);
  
  System.out.println(" enter the string ");
  String word = sc.nextLine();
  int vowel=0;
  int ch;
  int count=0;
  
for(int i=0;i<word.length()-1;i++)
{
ch=word.charAt(i);

if( ch=='A'|| ch=='a'|| ch=='e'|| ch=='i'|| ch=='I' || ch=='E'|| ch=='o' || ch=='O' || ch=='u' || ch=='U'){
vowel++;
}
else {
count++;
} 
  
  }
  System.out.println(" the vowels are "+vowel+" the const are "+count);
  }
  }
