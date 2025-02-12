//write a programm to create a vector and add minimum 5 elements display the size and capacity of given vector 
// Java Program Implementing Vector
import java.util.Vector;

public class vector 
{
    public static void main(String[] args) 
    {
      
        // Create a new vector
        Vector<Integer> v = new Vector<>(5, 2);

      
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);

        
 System.out.println("give me some sunshine give me some rain"+v.capacity());
        System.out.println(" give me another chance so that i grow up once again "+v.size());
        for (int i : v) {
            System.out.println(i);
        }
    }
}
