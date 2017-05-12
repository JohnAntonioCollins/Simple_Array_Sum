/**
 * @Author John Antonio Collins
 * Created on 5/12/17.
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */      //PLAN: try/catch: make field varialbe "sum", in a for-loop add each element to .sum
        int length;
        int sum = 0;

        Scanner scan = new Scanner(System.in);
        length = scan.nextInt();
        
        for (int i = 0; i < length; i++)
        {
            sum += scan.nextInt();
        }
        System.out.println(sum);
    }
}