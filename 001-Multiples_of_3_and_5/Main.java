import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        int tests;
        int[] cases = null;
        if(args.length > 0) {
            cases = new int[1];
            cases[0] = Integer.parseInt(args[0]);
        }else {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                tests = Integer.parseInt(in.readLine());
                cases = new int[tests];
                for (int i = 0; i < tests; i++)
                    cases[i] = Integer.parseInt(in.readLine());
            } catch (IOException e) {
                System.exit(1);
            }
        }
        for(int k = 0; k < cases.length; k++){
            long sum = 0;
            long n3, n5, n15;
            n3 = (cases[k] % 3 == 0) ? cases[k] / 3 - 1 : cases[k] / 3;
            n5 = (cases[k] % 5 == 0) ? cases[k] / 5 - 1 : cases[k] / 5;
            n15 = (cases[k] % 15 == 0) ? cases[k] / 15 - 1 : cases[k] / 15;
            sum += (3 * n3 * (n3 + 1)) / 2;
            sum += (5 * n5 * (n5 + 1)) / 2;
            sum -= (15 * n15 * (n15 + 1)) / 2;
            System.out.println(sum);
        }
    }
}