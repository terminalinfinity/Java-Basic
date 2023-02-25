package String;

import java.io.*;

public class Exp1 {
    public static void main(String[] args) throws IOException {
        DataInputStream indata=new DataInputStream(System.in);
        System.out.print("Enter your Name:");
        String name=indata.readLine();
        System.out.println(name);
    }
}
