package dynamicProgrammingProblems;

import java.util.ArrayList;

public class IntPalindrome {
    public static void main(String[] args) {
        int test = 1331;
        System.out.println(isPalindrome(test));
        System.out.println(isPalindrome1(test));
    }
    public static boolean isPalindrome(int x) {
        boolean iP = true;
        String num  = Integer.toString(x);
        int mid = num.length()/2;
        for(int i = 0; i <= mid; i++){
            int lastDigit = num.length() -1 ;

            if(num.charAt(i) != num.charAt(lastDigit - i)){
                System.out.println(num.charAt(i));
                System.out.println(num.charAt(lastDigit -1));
                return false;
            }
        }
        return iP;

    }

    public static boolean isPalindrome1(int x) {
        ArrayList<Integer> arr1 = new ArrayList<>() ;
        ArrayList<Integer> arr2 = new ArrayList<>() ;

        boolean ok = false;

        if( x < 0) {
            return false ;
        }

        if( x < 10 && x >= 0 ){
            return true ;
        }

        while( x != 0 ){
            int comp = x % 10 ;
            arr1.add(comp) ;
            x = x / 10 ;
        }

        for(int i = arr1.size() - 1 ; i >= 0 ; i-- ){
            arr2.add(arr1.get(i)) ;
        }

        for(int i = 0 ; i < arr1.size() ; i++ ) {
            if (arr1.get(i) != arr2.get(i)) {
                ok = false ;
                return ok ;
            } else {
                ok = true ;
            }
        }
        return ok ;
    }
}
