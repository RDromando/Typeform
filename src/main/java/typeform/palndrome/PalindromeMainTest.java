package typeform.palndrome;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class PalindromeMainTest {



    public static void main(String[] args) {

        System.out.println(isPalndrome("Taco cat"));

    }

    public static boolean isPalndrome(String sentence) {

        sentence = sentence.replaceAll("\\s", "");

        sentence = sentence.toLowerCase();

        char[] sentenceArray = sentence.toCharArray();

        char[] sentenceArrayReverse = sentenceArray;

        ArrayUtils.reverse(sentenceArrayReverse);

        System.out.println(sentenceArray);
        System.out.println(sentenceArrayReverse);

        if (Arrays.equals(sentenceArray,sentenceArrayReverse)) {
            return true;
        }
        return false;

    }
}
