import java.util.*;

class Solution {
    public int solution(int[] A) {
        int result = 0;
        Set B = new HashSet();

        for(int a : A) {
            B.add(a);            
        }
        
        List<Integer> C = new ArrayList<Integer>(B);

        int index = 1;
        for(int c : C) {
            if(index != c) break;
            index++;
        }
        
        return index;
    }
}
