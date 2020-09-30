package typeform.anagram;

import org.apache.commons.lang3.ArrayUtils;
import sun.security.util.ArrayUtil;

import java.util.Arrays;

public class AnagramMainTest {



    public static void main(String[] args) {

        System.out.println(isAnagram("the morse code", "here come dots"));

    }

    public static boolean isAnagram(String firstWord, String secondWord) {


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

        String firstNewString = new String(firstWordArray);
        String secondNewString = new String(secondWordArray);

        System.out.println(firstNewString);
        System.out.println(secondNewString);

        if (firstNewString.equals(secondNewString)) {
            return true;
        }
        return false;

    }
}
