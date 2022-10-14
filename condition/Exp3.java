package condition;

import java.util.*;
public class Exp3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int x=sc.nextInt();
        if(x>0){
            System.out.println("x is positive");
        }
        else if(x<0){
        System.out.println("x is negative");
        }
        else{
            System.out.println("x is 0");
        }
    }
}
