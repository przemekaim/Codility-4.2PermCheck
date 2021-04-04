package pl.java.permcheck;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] A = {4, 1, 3, 2};
        System.out.println(Solution.solution(A));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);

        if (A[A.length - 1] != A.length)
            return 0;

        int visited = 0;
        for (int j : A) {
            visited++;
            if (j != visited)
                return 0;
        }
        return 1;
    }
}
