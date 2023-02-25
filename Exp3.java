package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exp3 {
    public static void main(String[] args) throws Exception{
        BufferedReader data=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your Name:");
        String name= data.readLine();
        System.out.println(name);
    }
}
