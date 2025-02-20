import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int new_i = scan.nextInt();
        double new_d = scan.nextDouble();
		scan.nextLine(); // read the rest of the line of input (newline character after the double token).
        String new_s = scan.nextLine();

        scan.close();
        System.out.println(i + new_i);
        System.out.println(d + new_d);
        System.out.println(s + new_s);
    }
}
