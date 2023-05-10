package dynamicProgrammingProblems;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class RomanToInt {
    public static LinkedHashMap<String, Integer> romanNumeralsMap = romanValue();
    public static List<String> romanNumerals = new ArrayList(romanNumeralsMap.keySet());

    public static void main(String[] args) {
        String test = "XV";
        System.out.println(romanToInt(test));
    }
    public static int romanToInt(String s) {
        romanValue();
        Integer value = 0;

        for(int i = 0; i < s.length(); i ++){
            String romanNumeral = String.valueOf(s.charAt(i));
            int rI = 0;
            if(i == s.length()-1){
                 rI += 0;
            }
            else {
                rI = romanNumerals.indexOf(String.valueOf(s.charAt(i + 1)));
            }
            if(romanNumerals.indexOf(romanNumeral) < rI){
                value -= romanNumeralsMap.get(romanNumeral);
            }
            else{
                value += romanNumeralsMap.get(romanNumeral);
            }

        }
        return value;
    }
    public static LinkedHashMap romanValue(){
        LinkedHashMap<String, Integer> romanNumeralsMap = new LinkedHashMap<String, Integer>();
        romanNumeralsMap.put("I", 1);
        romanNumeralsMap.put("V", 5);
        romanNumeralsMap.put("X", 10);
        romanNumeralsMap.put("L", 50);
        romanNumeralsMap.put("C", 100);
        romanNumeralsMap.put("D", 500);
        romanNumeralsMap.put("M", 1000);
        return romanNumeralsMap;
    }

}
