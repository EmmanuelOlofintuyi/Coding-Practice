package dynamicProgrammingProblems.lonelyInteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class lonelyintegerProblem {
    
    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
            HashSet<Integer> nums = new HashSet<>();
            for(int num: a){
                if(!nums.add(num)){
                    nums.remove(num);
                }
            }
            return new ArrayList<>(nums).get(0);
        }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 1, 3));
        int answer = lonelyinteger(nums);
        System.out.println(answer);
    }
}
