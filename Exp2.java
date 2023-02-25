package String;

import java.io.DataInputStream;

public class Exp2 {
    public static void main(String[] args) {
        DataInputStream data=new DataInputStream(System.in);
        String name=new String();
        try{
            System.out.println("Enter your Name:");
            name= data.readLine();
        }
        catch (Exception e){ }
        System.out.println(name);
    }
}
