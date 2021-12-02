package programmers.stackQueue;

import java.util.*;

class Progresses {
    public int[] solution(int[] progresses, int[] speeds) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < progresses.length; i++) {
            if((100-progresses[i])%speeds[i] == 0) {
                progresses[i] = (100-progresses[i])/speeds[i];
            } else {
                progresses[i] = ((100-progresses[i])/speeds[i]) + 1;
            }
        }

        int day = progresses[0];
        int count = 1;
        for(int i = 1; i < progresses.length; i++) {
            if(day < progresses[i]) {
                list.add(count);
                count = 1;
                day = progresses[i];
            } else {
                count++;
            }
        }
        list.add(count);

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
