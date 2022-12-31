package Operators;

public class Bitwise {
    public static void main(String[] args) {
        int a=2,b=5,c=1;
        System.out.println(a<b & c>a);//True & False=False
        System.out.println(a<b | c>a);//True & False=True
        System.out.println(a<b ^ c>a);//True & False=True
    }
}
