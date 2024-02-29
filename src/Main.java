import pachet.Help;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Help help=new Help();
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        if (s=="hello") help.see();
        else System.out.println("nu e hello");
    }
}