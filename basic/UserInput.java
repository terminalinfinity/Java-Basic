package basic;
import java.util.*;
public class UserInput {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); //System.in is a standard input stream
        System.out.println("Enter your number: ");
        int x=sc.nextInt();
        
        System.out.println("Enter your double number: ");
        double z=sc.nextDouble();
        
        System.out.println(x+z);
    }
}
