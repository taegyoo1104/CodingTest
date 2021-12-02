package programmers.hash;

import java.util.*;

class Runner {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> map = new HashMap<String, Integer>();

        for(String part: participant) {
            map.put(part, map.getOrDefault(part, 0) + 1);
        }
        for(String comp: completion) {
            map.put(comp, map.get(comp) - 1);
        }

        Set<String> keySet = map.keySet();
        Iterator<String> keyIter = keySet.iterator();
        while(keyIter.hasNext()) {
            String key = keyIter.next();
            Integer value = map.get(key);
            if(value != 0) {
                answer = key;
                break;
            }
        }

        return answer;
    }
}
