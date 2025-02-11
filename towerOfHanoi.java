/*you have three rodds and n dics which can slides onto any rod the puzzle starts with  the dics neatly stacked in ascending order  of size on the first rod  with the smallest disc at the top the objective is to
 move the enitre stack to the third rod  obeying the following rules
 * only one disc can be moved at a time and a disc can only be placed on top of a larger disc 
Write a recursion function to solve the towers of hanoi problem for n discs 

*/ public class hanoi {
    public static void hanoi(int n, char source, char destination, char auxiliary) {
      
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        
       
        hanoi(n - 1, source, auxiliary, destination);
        
        
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        
        
        hanoi(n - 1, auxiliary, destination, source);
    }

    public static void main(String[] args) {
        int n = 3; 
        hanoi(n, 'A', 'C', 'B');
    }
}
