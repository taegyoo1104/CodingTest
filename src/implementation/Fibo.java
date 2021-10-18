package implementation;

import java.util.Scanner;

public class Fibo {

    // 재귀함수 사용
    public static int fiboRecur(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fiboRecur(n - 1) + fiboRecur(n - 2);
    }

    // 메모이제이션 사용
    public static int fiboMemo(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 1;

        for(int i = 3; i <= n; i++ ) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(fiboRecur(number));

        System.out.println(fiboMemo(number));

    }

}