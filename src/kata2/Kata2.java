package kata2;

import java.util.HashMap;
import java.util.Map;


public class Kata2 {
    
    
    public static void main(String[] args) {
        int[] data = {1, 3, 4, 5, 6, 3, 1, 4, 7, 8, 9, 2, 4, 6, 7, 10, 25, 8,2};
        Map<Integer,Integer> histogram = new HashMap();
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])){
                histogram.put(data[i],histogram.get(data[i]) + 1);
            } else {
                histogram.put(data[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : histogram.entrySet()) {
            System.out.println("Key = " +entry.getKey() + ", Value = " + entry.getValue());
        }
        
    }
    
}
