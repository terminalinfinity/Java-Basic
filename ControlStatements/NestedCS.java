package ControlStatements;

import java.util.Scanner;

public class NestedCS {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int passes=0;
        int failures=0;
        int studentcounter=1;

        while (studentcounter<=10){
            System.out.print("Enter result(1=Pass,2=Fail):");
            int result= input.nextInt();

            if(result==1){
                passes=passes+1;
            }
            else {
                failures=failures+1;
            }
            studentcounter=studentcounter+1;
        }
        System.out.println("Passed:"+passes+" Failed:"+failures);
        if(passes>8){
            System.out.println("Bonus to instructor!!");
        }
    }
}
