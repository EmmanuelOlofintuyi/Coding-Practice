package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapSum {

    public static HashMap<String, Integer> arraySums = new HashMap<>();
    public static TreeMap<String, Integer> tArraySums = new TreeMap<>();

    public static void main(String args[]){
        int[] arrayExample = new int[] {5, 86, -2, 55, 3};
        int t = 3;
        mapGenerator(arrayExample);
        //System.out.println(arraySums);
        //System.out.println(tArraySums);
        //System.out.println(arraySums.containsValue(10));
        System.out.println(arraySums.containsValue(t));

    }

    public static void mapGenerator(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                String arrayKey = Integer.toString(i) + ", " + Integer.toString(j);
                int arrayValue = array[i] + array[j];
                arraySums.put(arrayKey, arrayValue);
                tArraySums.put(arrayKey, arrayValue);
            }

        }
    }
}
