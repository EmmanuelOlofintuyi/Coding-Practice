package hashing;

import java.util.Arrays;

public class HashFunction1 {
    String[] theArray;
    int arraySize;
    int itemsInArray = 0;

    public static void main(String[] args){
        HashFunction1 theFunc = new HashFunction1(30);

        String[] elementsToAdd = {"1", "5", "17", "21", "26"};

        theFunc.hashFunction(elementsToAdd, theFunc.theArray);
        theFunc.displayTheStack();
    }

    public void hashFunction(String[] stringForArray, String[] theArray){
        for(int n = 0; n < stringForArray.length; n++){
            String newElementVal = stringForArray[n];
            theArray[Integer.parseInt(newElementVal)] = newElementVal;
        }
    }
    HashFunction1(int size){
        arraySize = size;
        theArray = new String[size];
        Arrays.fill(theArray,  "-1");

    }

    public void hashFunction2(String[] stringsForArray, String[] theArray){
        for(int n = 0; n < stringsForArray.length; n++){
            String newElementVal = stringsForArray[n];
            int arrayIndex = Integer.parseInt(newElementVal) % 29;
            System.out.println("Modules Index= " + arrayIndex + newElementVal);
            while(theArray[arrayIndex] != "-1"){
                ++arrayIndex;
                System.out.println("Collision Try " + arrayIndex + " Instead");
                arrayIndex %= arraySize;

            }
            theArray[arrayIndex] = newElementVal;
        }
    }

    public void displayTheStack() {
         
                int increment = 0;
         
                for (int m = 0; m < 3; m++) {
         
                    increment += 10;
         
                    for (int n = 0; n < 71; n++)
                        System.out.print("-");
         
                    System.out.println();
         
                    for (int n = increment - 10; n < increment; n++) {
         
                        System.out.format("| %3s " + " ", n);
         
                    }
         
                    System.out.println("|");
         
                    for (int n = 0; n < 71; n++)
                        System.out.print("-");
         
                    System.out.println();
         
                    for (int n = increment - 10; n < increment; n++) {
        
         
                        if (theArray[n].equals("-1"))
                            System.out.print("|      ");
         
        
                        else
                            System.out
                                    .print(String.format("| %3s " + " ", theArray[n]));
         
                    }
         
                    System.out.println("|");
         
                    for (int n = 0; n < 71; n++)
                        System.out.print("-");
         
                    System.out.println();
         
                }
            }        
}
