package typeform.anagram;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;

public class AnagramMainTest2 {



    public static void main(String[] args) {

        System.out.println(isAnagram("the morse code", "here come dots"));

    }

    public static boolean isAnagram(String firstWord, String secondWord) {

        //deleting empty spaces
       firstWord = firstWord.replaceAll("\\s", "");
       secondWord = secondWord.replaceAll("\\s", "");

        int length1 = firstWord.length();
        int length2 = secondWord.length();

        if (length1 != length2) {
            return false;
        }

        firstWord = firstWord.toLowerCase();
        secondWord = secondWord.toLowerCase();

        char[] firstWordArray = firstWord.toCharArray();
        char[] secondWordArray = secondWord.toCharArray();

        Arrays.sort(firstWordArray);
        Arrays.sort(secondWordArray);

//        ArrayUtils.reverse(firstWordArray);
//        ArrayUtils.reverse(secondWordArray);

        System.out.println(firstWordArray);
        System.out.println(secondWordArray);


        if (Arrays.equals(firstWordArray, secondWordArray)) {
            return true;
        }
        return false;

    }
}
