package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceChecker {

    public boolean checkSentence(String input) {

        boolean isSentenceValid = true;

        char[] characters = input.toCharArray();
        int ctr = 0;
        for (char ch : characters
        ) {
            if (ch == '"') ctr++;
        }
        if (ctr % 2 != 0) return false;

        // alternate approach with streams
        //    public static boolean stringE(String input) {
//        //IntStream intStream = str.chars();
//        long ctr = input.chars().mapToObj(c -> (char) c)
//                .filter(character -> character.equals('"'))
//                .count();
//        return (ctr % 2 == 0);
//
//    }

//        Pattern singleNumberPattern = Pattern.compile("([\\s,][\\d]{1}[\\s,])");
//        Matcher singleNumberMatcher = singleNumberPattern.matcher(input);
//        if(singleNumberMatcher.find()) return false;
//
//        Pattern tenToTwelvePattern = Pattern.compile("[\\s,][1][0-2][\\s,]");
//        Matcher tenToTwelvematcher = tenToTwelvePattern.matcher(input);
//        if(tenToTwelvematcher.find()) return false;

        Pattern numberPattern = Pattern.compile("([\\s,][\\d]{1}[\\s,])|([\\s,][1][0-2][\\s,])");
        Matcher numberMatcher = numberPattern.matcher(input);
        if(numberMatcher.find()) return false;

        Pattern textPattern = Pattern.compile("^[A-Z][^.]*[.?!]$");
        Matcher textMatcher = textPattern.matcher(input);
        isSentenceValid = textMatcher.find();
        return isSentenceValid;

    }
}
