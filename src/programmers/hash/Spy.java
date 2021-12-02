package programmers.hash;

import java.util.*;

class Spy {
    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1] , 0) + 1);
        }

        Set<String> keySet = map.keySet();
        Iterator<String> keyIt = keySet.iterator();
        while(keyIt.hasNext()) {
            Integer value = map.get(keyIt.next());
            answer *= (value+1);
        }

        return answer-1;
    }
}