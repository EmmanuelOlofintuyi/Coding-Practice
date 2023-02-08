package mergerSort_quickSort.mergeSort.mergeSortExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortPeopleList {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            Person p = new Person("person " + Integer.toString(i),rand.nextInt(100));
            people.add(p);
        }
        System.out.println("Before");
        printList(people);

        mergeSortList(people);

        System.out.println("\nAfter:");
        printList(people);

        }

    public static void mergeSortList(List<Person> people) {
        int peopleSize = people.size();

        if (peopleSize < 2) {
            return;
        }

        int middleIndex = peopleSize/2;
        List<Person> leftHalf = new ArrayList<>();
        List<Person> rightHalf = new ArrayList<>();

        for(int i = 0; i < middleIndex; i++){
            leftHalf.add(i, people.get(i));
        }
        for(int i = middleIndex; i < peopleSize; i++){
            rightHalf.add(i-middleIndex, people.get(i));
        }

        mergeSortList(leftHalf);
        mergeSortList(rightHalf);
        mergeList(people, leftHalf, rightHalf);
    }

    public static void mergeList(List<Person> people, List<Person> leftHalf, List<Person> rightHalf){
        int leftSize = leftHalf.size();
        int rightSize = rightHalf.size();

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<leftSize && j < rightSize){
            if (leftHalf.get(i).getAge() <= rightHalf.get(j).getAge()){
                people.set(k, leftHalf.get(i));
                i++;
            }
            else{
                people.set(k, rightHalf.get(j));
                j++;
            }
            k++;
        }
        while (i < leftSize){
            people.set(k, leftHalf.get(i));
            i++;
            k++;
        }

        while (j < rightSize){
            people.set(k,rightHalf.get(j));
            j++;
            k++;
        }
    }



    public static void printList(List<Person> people) {
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).toString());
        }
    }








}
