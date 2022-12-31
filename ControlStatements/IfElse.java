package ControlStatements;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your Grade: ");
        int grade= input.nextInt();
        if(grade>=80){
            System.out.println("Grade is:A+");
        }
        else if (grade>=70) {
            System.out.println("Grade is:A");
        }
        else if (grade>=60) {
            System.out.println("Grade is:B");
        }
        else if (grade>=50) {
            System.out.println("Grade is:C");
        }
        else if (grade>=40) {
            System.out.println("Grade is:D");
        }
        else{
            System.out.println("Fall!!");
        }
    }
}
