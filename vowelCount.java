import java.util.Scanner;

class Vowels{
 public static void main(String[] args ){
  Scanner sc = new Scanner(System.in);
  
  System.out.println(" enter the string ");
  String word = sc.nextLine();
  int vowel=0;
  int ch;
  int count=0;
String   word2= word.toLowerCase();
for(int i=0;i<word.length()-1;i++)
{
ch=word2.charAt(i);

if(  ch=='a'|| ch=='e'|| ch=='i'||  ch=='o'|| ch=='u' ){
vowel++;
}
else {
count++;
} 
  
  }
  System.out.println(" the vowels are "+vowel+" the const are "+count);
System.out.println(word2);
  }
  }
