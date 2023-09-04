package com.cbfacademy;

public class StringExercises {

    public String fromCharacters(char[] characters) {
        // TODO - Write code that creates a String from the input array of characters
        String finals = "";
        for (char character : characters){
            finals = finals + character;
        }
        return finals.toString();
    }

    public Long howMany(String text, Character character) {
        // TODO - Write code to determine how many of the input ${character} are contained in the input ${text}
        Long cnter = 0L;
        for(char i : text.toCharArray()){
            if(i == character) {
                cnter++;
            }
        }
        return cnter;
    }

    public Boolean isPalindrome(String word) {
        // TODO - Write code to determine whether the input ${word} is a palindrome
        for (char i : word.toCharArray()){
            for(int j = word.length()-1; j >= 0; j--){
                if( (word.indexOf(i) + j == word.length()-1) && (i != word.charAt(j))){
                    return false;
                }
            }
        }
        return true;
    }

    public String getName() {
        return "String Exercises";
    }
}
