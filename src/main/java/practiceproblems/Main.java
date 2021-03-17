package practiceproblems;

import java.util.Arrays;

public class Main {


    //Question 1
    public static int getLastIndex(String[] names) {
        return names.length - 1;
    }

    //Question 2
    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;
    }

    //Question 3
    public static String getFirstElement(String[] names) {
        String firstEl = names[0];
        return firstEl;
    }

    //Question 4
    public static String getLastElement(String[] names) {
        String lastEl = names[names.length-1];
        return lastEl;
    }

    //Question 5
    public static String getSecondToLastElement(String[] names) {
        String secondTolastEl = names[names.length-2];
        return secondTolastEl;
    }

    //Question 6
    public static int getSum(int[] ints) {
        int sum = 0;
        for(int i = 0; i < ints.length; i++){
            sum += ints[i];
        }
        return sum;
    }


   //Question 7
    public static int getAverage(int[] ints) {
        int sum = 0;
        for(int i = 0; i < ints.length; i++){
            sum += ints[i];
        }
        int average = sum / ints.length;
        return average;
    }

    //Question 8

     public static String extractAllOddNumbers(int[] numbers) {
          String oddNums = "";
          int counter = 0;

          for (int i = 0; i < numbers.length; i++) {
              if (numbers[i] % 2 != 0) {
                 if(counter == 0){
                    oddNums = oddNums + numbers[i];
                    counter++;
                    } else{
                        oddNums = oddNums + ", " + numbers[i] ;
                    }
                }
            }
            return oddNums;
        }

    //Question 9
    public static String extractAllEvenNumbers(int[] numbers) {
        String evenNums = "";
        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                if(counter == 0){
                    evenNums = evenNums + numbers[i];
                    counter++;
                } else{
                    evenNums = evenNums + ", " + numbers[i] ;
                }
            }
        }
        return evenNums;
    }

    //Question 10
    public static boolean contains(String[] names, String element) {
        boolean contain = true;
        for(int i = 0; i < names.length; i++){
            if(names[i].equals(element)){
                contain = true;
            } else {
                contain = false;
            }
        }
        return contain;
    }


    //Question 11
    public static int getIndexByElement(String[] names, String element) {
        int index = 0;
        for(int i = 0; i < names.length; i++){
            if(names[i].equals(element)){
                index = i;
                break;
            }
        }
        return index;
    }


    //Question 12
    public static void printOddNumbersInRange(int start, int end){
        for(int i = start; i < end; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }


    //Question 13
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        String s = "";
        for(int i = 0; i < n; i++){
            s += str;
        }
        return s;
    }


    //Question 14
    public static String repeatFirstThreeLetters(String str, int n) {
        String firstThree = str.substring(0, 3);
        String s = "";
        for(int i = 0; i < n; i++){
            s += firstThree;
        }
        return s;
    }

    //Question 15
    public static int WordsInAStringCounter(String str){
       int words = 1;
       for(int i = 0; i < str.length(); i++){
           if(str.charAt(i) == ' '){
               words++;
           }
       }
       return words;
    }



    //Question 16
   // A, E, I, O, U, and sometimes Y
    public static int VowelsCounter(String str){
        int vowels = 0;
        for(int i = 0; i < str.length(); i++) {
            if ("AEIOUaeiou".indexOf(str.charAt(i)) >= 0) {
                vowels++;
            }
        }
        return vowels;
    }

    //Question 17
    public static String[] swap(String[] stringArray) {
        String first = stringArray[0];
        stringArray[0] = stringArray[stringArray.length-1];
        stringArray[stringArray.length-1] = first;
        return stringArray;
    }

    //Question 18
    public static String replaceCharacters(String str) {
        String replaced = str;
        replaced = replaced.replace('f', '7');
        replaced = replaced.replace('s', '$');
        replaced = replaced.replace('1', '!');
        replaced = replaced.replace('a', '@');

        return replaced;
    }

    //Question 19 " The small brown dog hopped the fence " becomes " The Wu Tang Wu Hopped Wu Fence "
    public static String replaceWuTangTwoThreeDivisible(String stringInput) {
        String[] wordArr = stringInput.split(" ");
        for(int i = 1; i < wordArr.length; i++){
            if(i % 2 == 0){
                wordArr[i-1] = "Wu";
            } else if (i % 3 == 0){
                wordArr[i-1] = "Tang";
            }
        }
        String replaced = String.join(" ", wordArr);
        System.out.println(replaced);
        return stringInput;
    }


    //Question 20
    public static String createStringOfFibonnaciUpToMax(int maxnumber) {
        String s = "0 ";
        int current = 1;
        int last = 0;
        int next = current + last;

        while (current <= maxnumber) {
            s = s + next + " ";
            next = current + last;
            last = current;
            current = next;
            }

        return s;
    }


    public static void main(String[] args) {
    }
}
