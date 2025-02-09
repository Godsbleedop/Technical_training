import java.util.Scanner;
public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String ");
        String passw = scanner.nextLine();
        System.out.println("Password: " + passw);
              String passs = passw.substring(0,4);
              System.out.println(" "+ passs);


scanner.close();
}
}
