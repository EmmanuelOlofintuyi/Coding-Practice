package mergeSort_quickSort.megeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];
         for(int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(1000000);
         }

         List<Integer> numbersList= new ArrayList<>();
        for(int i = 0; i < 10; i++){
            numbersList.add( rand.nextInt(1000000));
        }

        System.out.println("Before");
         //printArray(numbers);
        printList(numbersList);

         mergeSortList(numbersList);

        System.out.println("\nAfter:");
        //printArray(numbers);
        printList(numbersList);

    }

    public static void mergeSort(int[] inputArray){
        int inputLength = inputArray.length;

        if (inputLength<2){
            return;
        }
        int midIndex = inputLength/2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength-midIndex];

        for(int i = 0; i < midIndex; i++){
            leftHalf[i] = inputArray[i];
        }
        for(int i = midIndex; i < inputLength; i++){
            rightHalf[i-midIndex] = inputArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(inputArray, leftHalf, rightHalf);
    }

    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0;
        int j = 0;
        int k = 0;
        while(i<leftSize && j < rightSize){
            if (leftHalf[i]<=rightHalf[j]){
                inputArray[k] = leftHalf[i];
                i++;
            }
            else{
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize){
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize){
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }

    }

    public static void mergeSortList(List<Integer> inputList){
        int inputLength = inputList.size();

        if (inputLength<2){
            return;
        }
        int midIndex = inputLength/2;
        List<Integer> leftHalf = new ArrayList<>();
        List<Integer> rightHalf = new ArrayList<>();

        for(int i = 0; i < midIndex; i++){
            leftHalf.add(i, inputList.get(i));
        }
        for(int i = midIndex; i < inputLength; i++){
            rightHalf.add(i-midIndex, inputList.get(i));
        }

        mergeSortList(leftHalf);
        mergeSortList(rightHalf);
        mergeList(inputList, leftHalf, rightHalf);
    }

    private static void mergeList(List<Integer> inputList, List<Integer> leftHalf, List<Integer> rightHalf){
        int leftSize = leftHalf.size();
        int rightSize = rightHalf.size();

        int i = 0;
        int j = 0;
        int k = 0;
        while(i<leftSize && j < rightSize){
            if (leftHalf.get(i)<=rightHalf.get(j)){
                inputList.set(k, leftHalf.get(i));
                i++;
            }
            else{
                inputList.set(k, rightHalf.get(j));
                j++;
            }
            k++;
        }
        while (i < leftSize){
            inputList.set(k, leftHalf.get(i));
            i++;
            k++;
        }

        while (j < rightSize){
            inputList.set(k,rightHalf.get(j));
            j++;
            k++;
        }

    }


    public static void printArray(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }

    public static void printList(List<Integer> numbers){
        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
    }
}
