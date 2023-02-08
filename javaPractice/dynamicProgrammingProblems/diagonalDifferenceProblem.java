package dynamicProgrammingProblems;

import java.util.ArrayList;
import java.util.List;

public class diagonalDifferenceProblem {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
            List<Integer> leftSide = new ArrayList<>();
            List<Integer> rightSide = new ArrayList<>();
            int rightSum=0;
            int leftSum=0;
            for(int i = 0; i < arr.size(); i++){
                List<Integer> list= arr.get(i);
                leftSide.add(list.get(i));
                rightSide.add(list.get(arr.size()-(i+1)));
               
            }
            for(int num: leftSide){
                leftSum+=num;
            }
            for(int num: rightSide){
                rightSum+=num;
            }
            
            int result = Math.abs(leftSum-rightSum);
            return result;
        }
        
}
