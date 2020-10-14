package kata2;

import java.util.HashMap;
import java.util.Map;


public class Kata2 {
    
    
    public static void main(String[] args) {
        int[] data = {1, 3, 4, 5, 6, 3, 1, 4, 7, 8, 9, 2, 4, 6, 7, 10, 25, 8,2};
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        for (Map.Entry<Integer,Integer> entry : histogr.entrySet()) {
            System.out.println("Key = " +entry.getKey() + ", Value = " + entry.getValue());
        }
        
    }
    
}
