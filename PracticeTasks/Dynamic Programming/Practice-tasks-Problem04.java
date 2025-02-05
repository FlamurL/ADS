/*
What is the minimum number of times we need to subtract the square of an integer for a number X to become 0?

Input: Integer X from 1 to 10^5

Output: the desired result.

Examples:
Input
13
21
25
32

Output
2
3
1
16

 */

import java.util.Scanner;

class Task3{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int result= 100000000;
        double square=Math.sqrt(x);
        int[] dp=new int[x+1];
        dp[0]=0;
        for(int i=1;i<=x;i++){
            dp[i]=100000000;
        }
        for(int i=1;i<=square;i++){
            dp[i*i]=1;
        }
        for(int i=1;i<=x;i++){
            for(int j=1;j<i;j++){
dp[i]=Math.min(dp[i],dp[j]+dp[i-j]);
            }
        }
//your code here

        System.out.println(dp[x]);
    }
}