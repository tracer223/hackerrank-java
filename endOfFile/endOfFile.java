package endOfFile;

import java.io.*;
import java.util.*;

public class endOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = 0;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            n++;
            System.out.println(n + " " + sc.nextLine());
        }
    }
}
