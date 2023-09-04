package com.cbfacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // create a list where for each element of the input list ${numbers}
        List<String> result = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++){
            // if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
            if((numbers.get(i) % 3 == 0) && (numbers.get(i) % 5 == 0)){
                result.add(i, "FizzBuzz");
            }
            // if the ${element} is divisible by 3, it adds “Fizz” to the list
            else if(numbers.get(i) % 3 == 0){
                result.add(i, "Fizz");
            }
            // if the ${element} is divisible by 5, it adds “Buzz” to the list
            else if(numbers.get(i) % 5 == 0){
                result.add(i, "Buzz");
            }
            // it adds the element to the list in any other case
            else {
                result.add(i, String.valueOf(numbers.get(i)));
            }
        }
        //  it returns the constructed list
        return result;
    }

    public String whichMonth(Integer number) {
        Map<Integer, String> months = new HashMap<Integer, String>();
        months.put(1, "January");
        months.put(2, "February");
        months.put(3, "March");
        months.put(4, "April");
        months.put(5, "May");
        months.put(6, "June");
        months.put(7, "July");
        months.put(8, "August");
        months.put(9, "September");
        months.put(10, "October");
        months.put(11, "November");
        months.put(12, "December");

        // it returns the month corresponding to the input ${number}
        // if the ${number} is invalid, the method should return "Invalid month number"
        String s = (months.get(number) != null) ? (months.get(number)) : ("Invalid month number");
        return s;
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {

        // creates and initialises a list of 100 numbers - from 1 to 100
        List<Integer> num100 = new ArrayList<>();
        for(int i = 1 ; i <= 100; i++){
            num100.add(i);
        }

        int sumOfEvens = 0, sumOfOdds = 0;
        for (Integer i : num100) {
            //  - determines the sum of all the even numbers in the list
            if(i % 2 == 0){
                sumOfEvens += i;
            }
            //  - determines the sum of all the odd numbers in the list
            else{
                sumOfOdds += i;
            }
        }
        //  - returns a map with two entries:
        Map<String, Integer> sumof100 = new HashMap<>();
        sumof100.put("SumOfEvens", sumOfEvens);
        sumof100.put("SumOfOdds", sumOfOdds);

        return sumof100;
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}

    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // it takes an array list of integers
        // it returns the list in reverse order
        List<Integer> revList =  new ArrayList<>();
        for (int i = (numbers.size()-1); i >= 0; i--){
            revList.add(numbers.get(i));
        }
        return revList;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
