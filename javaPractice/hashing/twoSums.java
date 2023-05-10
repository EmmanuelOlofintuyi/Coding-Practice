package hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class twoSums {
    public static HashMap<int[], Integer> arraySums = new HashMap<>();
    public static TreeMap<String, Integer> tArraySums = new TreeMap<>();
    public static void main(String args[]){
        int[] arrayExample = new int[] {3, 2, 3};
        int t = 6;
        mapGenerator(arrayExample);
        //System.out.println(arraySums);
        //System.out.println(tArraySums);
        //System.out.println(arraySums.containsValue(10));
        System.out.println(Arrays.toString(twoSum(arrayExample, t)));

    }
    public static int[] twoSum(int[] num, int target) {
        mapGenerator(num);

        return key(arraySums, target);

    }

    public static void mapGenerator(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                String arrayKey = Integer.toString(i) + ", " + Integer.toString(j);
                int[] key = new int[2];
                key[0] = i;
                key[1] = j;
                int arrayValue = array[i] + array[j];
                arraySums.put(key, arrayValue);
                tArraySums.put(arrayKey, arrayValue);
            }

        }
    }

    public static int[] key(HashMap<int[], Integer> nums, int target){
        int size = 0;
        Integer[] keyInteger = new Integer[2];
        int[] key = new int[2];
        for (Map.Entry<int[], Integer> entry : nums.entrySet()) {
            if (entry.getValue() == target) {
                //ArrayList<Integer> k = new ArrayList<>();

                return entry.getKey();

            }
        }

        return null;
    }
}
