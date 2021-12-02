package programmers.search;

import java.util.*;

class MockTest {
    public int[] solution(int[] answers) {
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;

        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == p1[i % p1.length]) {
                a1++;
            }
            if(answers[i] == p2[i % p2.length]) {
                a2++;
            }
            if(answers[i] == p3[i % p3.length]) {
                a3++;
            }
        }

        int max = Math.max(Math.max(a1, a2), a3);
        ArrayList<Integer> list = new ArrayList<>();
        if(max == a1) {
            list.add(1);
        }
        if(max == a2) {
            list.add(2);
        }
        if(max == a3) {
            list.add(3);
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}