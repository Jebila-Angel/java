/*
Objective
In this challenge, we're going to use loops to help us do some simple math.

Task
Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.

Input Format

A single integer, .

Constraints

Output Format

Print  lines of output; each line  (where ) contains the  of  in the form:
N x i = result.
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class HRP5_ForLoop {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

for(int i=1; i<=10; i++){
    System.out.printf("%d x %d = %d\n",N,i,N*i);
}
        bufferedReader.close();
    }
}
