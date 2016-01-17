import java.util.Scanner;

/**
 *
 * @author User
 */
public class sticks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int n = 21;
        System.out.println("There are 21 sticks in total. The one who is left with only 1 stck in his/her chance, looses!");
        while(n>1){
            System.out.println("Enter no. of sticks to pick: ");
             int i = Integer.parseInt(s.next());
             if(i<=4 && i>0){
                 n = n-i;
                 System.out.println("No. of sticks left in computer's turn: "+n);
                 System.out.println("Computer picked "+(5-i)+" sticks");
                 n = n - (5-i);
                 System.out.println("No. of sticks left in your turn: "+n);
             }
             else {
                 System.out.println("Wrong input!!");
             }
        }
        System.out.println("You loose! :P");
    }
    
}
