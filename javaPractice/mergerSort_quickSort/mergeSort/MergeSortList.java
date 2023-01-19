package mergerSort_quickSort.mergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MergeSortList {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> numbersList= new ArrayList<>();
        for(int i = 0; i < 10; i++){
            numbersList.add( rand.nextInt(1000000));
        }

        System.out.println("Before");
        printList(numbersList);

        mergeSortList(numbersList);

        System.out.println("\nAfter:");
        printList(numbersList);

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

    public static void printList(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}

