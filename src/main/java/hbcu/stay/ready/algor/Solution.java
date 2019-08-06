package hbcu.stay.ready.algor;
import java.util.HashSet;
import java.util.ArrayList;

public class Solution {

    // for each word in magazine text check if the word is the same as the current word in our message
    // if it is the same then check if we already accounted for that word in our set
    //
    public Boolean harmlessRansomNote(String message , String magazineText) {
        String[] messageArray = message.split(" ");// to traverse words of the string
        String[] magazineTextArray = magazineText.split(" "); // to traverse through to whole message
        HashSet<String> trueSet = new HashSet<>(); //to add to and determine if words duplicate
        ArrayList<String> trueList = new ArrayList<>(); // to add matching words to
        boolean finalValue = true; // boolean return variable


        //compare every word in message array to every word in magazineText array and if they match put them aside in
        //array list
        for (int x = 0; x <= messageArray.length - 1; x++) {
            for (String word : magazineTextArray) {
                if (messageArray[x] == word) {
                    trueList.add(messageArray[x]);
                }
            }
        }
        
        //if there are duplicates then the test should fail so finalValue can match up with if we
        //are able to add a word to our set
        for(String word: trueList){
            finalValue = trueSet.add(word);
        }

        return finalValue;
    }
}

