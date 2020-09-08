/*************************************************************************
 *  Compilation:  javac RunLengthEncoding.java
 *  Execution:    java RunLengthEncoding
 *
 *  @author: Shaan Jalal, sfj21@scarletmail.rutgers.edu, sfj21
 *
 *************************************************************************/

public class RunLengthEncoding {

    /* 
     * Encode the original string by finding sequences in the string
     * where the same character repeats. Replace each such sequence
     * by a token consisting of: the number of characters in the sequence
     * followed by the repeating character.
     * Return the encoded string.
     */
    public static String encode (String original)  
    {
        char lastchar = original.charAt(0);
        int counter = 1;
        String lastString = "";
        char curchar = lastchar;
        int len = original.length();

        for(int i = 1; i < len; i++) {
            curchar = original.charAt(i);
            if (lastchar == curchar) {
                counter++;
                if (i == len - 1) {
                    lastString = writeToOutputString(lastString, counter, lastchar);
                }
            } else {
                lastString = writeToOutputString(lastString, counter, lastchar);
                counter = 1;
                lastchar = curchar;
            }
        }
        return lastString;
    }

    public static String writeToOutputString(String lastString, int counter, Character lastchar) {
        if (counter != 1) {
            lastString += counter;
        }
        return lastString + Character.toString(lastchar);
    }

    public static String decode (String original) {
        if (original.length() == 1 || original.length() == 0) {
            return original;
        }
        char firstchar = original.charAt(0);
        if (Character.isDigit(firstchar)) {
            char letter = original.charAt(1);
            return repeat(firstchar - '0', letter) + decode(original.substring(2));
        } else {
            return firstchar + decode(original.substring(1));
        }
    }

    public static String repeat(int num, char letter) {
        if (num == 0) {
            return "";
        } 
        return letter + repeat(num - 1, letter);
    }

    public static void main (String[] args) {
        System.out.println(encode("ggkffddda"));
        System.out.println(decode("2g2fc5ba"));
    }
}
