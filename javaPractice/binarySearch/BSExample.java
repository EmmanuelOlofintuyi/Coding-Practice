package binarySearch;

import java.util.ArrayList;
import java.util.List;

public class BSExample {
    public static int searchInsert(int[] nums, int target) {
        if(nums.length == 0){
            return -1;
        }
        int left = 0;
        int right = nums.length -1;
        int mid = 0;
        while(left <= right){
            mid = left + (right  - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] >  target){
                right = mid - 1;

            }
            else{
                left = mid + 1;
            }
        }
        if(target > mid){
            return left;
        }
        else{
            return right;
        }
    }
    public static int search(int[] num, int target){
        if(num.length == 0){
            return -1;
        }
        int left = 0;
        int right = num.length-1;

        while(left <= right){
            int midpoint = left + (right - left)/2;
            if(num[midpoint] == target){
                return midpoint;
            }
            else if (num[midpoint] > target) {
                right = midpoint -1;
            } else {
                left = midpoint + 1;
            }
        }
        return -1;

    }

    public static int listSearch(List<Integer> num, int target){
        if(num.size() == 0){
            return -1;
        }
        int left = 0;
        int right = num.size()-1;

        while(left <= right){
            int midpoint = left + (right - left)/2;
            if(num.get(midpoint) == target){
                return midpoint;
            }
            else if (num.get(midpoint) > target) {
                right = midpoint -1;
            } else {
                left = midpoint + 1;
            }
        }
        return -1;

    }



    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4 , 9, 12, 22, 55, 56, 57, 58, 100};
        int[] nums1 = {1,3,5,6};

        List<Integer> listNums = new ArrayList<>();{{
            listNums.add(1);
            listNums.add(2);
            listNums.add(3);
            listNums.add(4);
            listNums.add(4);
            listNums.add(9);
            listNums.add(12);
            listNums.add(22);
            listNums.add(55);
            listNums.add(56);
            listNums.add(57);
            listNums.add(58);
            listNums.add(100);


        }}
        System.out.println(listSearch(listNums, 55));
        System.out.println(searchInsert(nums1, 0));
    }
}
