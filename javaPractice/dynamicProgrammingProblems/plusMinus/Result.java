package dynamicProgrammingProblems.plusMinus;

import java.text.DecimalFormat;
import java.util.List;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    static double negativeCount;
    static double neutralCount;
    static double positiveCount;
    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    
    for(int number: arr){
        if(number < 0){
            negativeCount++;
        }
        else if(number == 0){
            neutralCount++;
        }
        else{
            positiveCount++;
        }
        
    }
    double negativeRatio = negativeCount/arr.size();
        double neutralRatio = neutralCount/arr.size();
        double positiveRatio = positiveCount/arr.size();
        System.out.format("%.6f", negativeRatio);
        System.out.format("%.6f", neutralRatio);
        System.out.format("%.6f", positiveRatio);
    }

}
