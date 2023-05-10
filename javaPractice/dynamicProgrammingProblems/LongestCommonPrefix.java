package dynamicProgrammingProblems;

import java.util.*;

public class LongestCommonPrefix {
    static HashMap<String, Integer> stringSize = new HashMap<String, Integer>();
    public static void main(String[] args) {
        String[] str =  {"dog","racecar","car"};
        longestCommonPrefix(str);
    }


    public static String longestCommonPrefix(String[] strs) {
        //Arrays.sort(str);
        hashMapGenerator(strs);
        String prefix = prefix = Collections.max(stringSize.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();;
        String compare = "";
        for(String s : strs){
            compare = s;
            int count  = 0;
            for(int i = s.length()-1; i >= 0; i--){

                if(prefix.length() <= compare.length()){
                    if(!prefix.equals(compare.substring(0, prefix.length())) && i>=0){
                        prefix = prefix.substring(0, prefix.length()- 1);
                        compare = s.substring(0, count);
                    }
                    else{
                        //prefix
                        break;
                    }
                }
                if(!prefix.equals(compare) && i>0){
                    prefix = prefix.substring(0, prefix.length()- 1);
                    compare = s.substring(0, count);
                }
                else{
                    break;
                }
                count++;
            }

        }
        return prefix;

    }

    public static void hashMapGenerator(String[] strs){
        for(String s : strs){
            stringSize.put(s, s.length());
        }
    }

}
