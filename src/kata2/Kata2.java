package kata2;

import java.util.HashMap;
import java.util.Map;


public class Kata2 {
    
    
    public static void main(String[] args) {
        int[] data = {1, 3, 4, 5, 6, 3, 1, 4, 7, 8, 9, 2, 4, 6, 7, 10, 25, 8,2};
        Map<Integer,Integer> histogram = new HashMap();
        for (int key : data) {
            histogram.put(key,histogram.containsKey(key)? histogram.get(key)+1: 1);
        }
        for (Map.Entry<Integer,Integer> entry : histogram.entrySet()) {
            System.out.println("Key = " +entry.getKey() + ", Value = " + entry.getValue());
        }
        
    }
    
}
