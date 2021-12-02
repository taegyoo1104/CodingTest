package programmers.stackQueue;

import java.util.*;

class Printer {
    public int solution(int[] priorities, int location) {


        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < priorities.length; i++) {
            pq.add(priorities[i]);
        }

        int answer = 1;
        while(!pq.isEmpty()) {
            for(int i = 0; i < priorities.length; i++) {
                if(priorities[i] == pq.peek()) {
                    if(location == i) {
                        pq.clear();
                        break;
                    }
                    pq.poll();
                    answer++;
                }
            }
        }

        return answer;
    }
}