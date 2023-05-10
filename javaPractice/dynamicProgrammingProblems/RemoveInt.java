package dynamicProgrammingProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveInt {

    public static void main(String[] args) {
        int[] nums =  {0,1,2,2,3,0,4,2};
        int val = 3;
        removeElement(nums, val);

        System.out.println(removeElement(nums, val));

    }
    public static int removeElement(int[] nums, int val) {
        int count = 0;

        for(int n : nums) {
            if(n != val) {
                nums[count] = n;
                count++;
                //target.add(n);
            }
        }

        //arraylist.removeAll(target);
        //nums = arraylist.stream().mapToInt(i -> i).toArray();
        return count;
    }
}
