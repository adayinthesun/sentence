package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceCheckerTest {
    SentenceChecker sentenceChecker = new SentenceChecker();
    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkSentenceWithEvenNumberOfQuotes() {
        Boolean result = sentenceChecker.checkSentence("The quick brown fox said \\\"hello Mr lazy dog\\\".");
        assertEquals(true, result);
    }

    @Test
    void checkSentenceWithoutNumbers() {
        Boolean result = sentenceChecker.checkSentence("The quick brown fox said hello Mr lazy dog.");
        assertEquals(true, result);
    }
    @Test
    void checkSentenceWithNumeric13() {
        Boolean result = sentenceChecker.checkSentence("One lazy dog is too few, 13 is too many.");
        assertEquals(true, result);
    }
    @Test
    void checkSentenceWithThirteen() {
        Boolean result = sentenceChecker.checkSentence("One lazy dog is too few, thirteen is too many.");
        assertEquals(true, result);
    }
    @Test
    void checkSentenceEndingWithQuestionMark() {
        Boolean result = sentenceChecker.checkSentence("How many \\\"lazy dogs\\\" are there?");
        assertEquals(true, result);
    }
    @Test
    void checkSentenceWithFullStopAfterMr() {
        Boolean result = sentenceChecker.checkSentence("The quick brown fox said \\\"hello Mr. lazy dog\\\".");
        assertEquals(false, result);
    }
    @Test
    void checkSentenceWithFirstWordNotCapitalized() {
        Boolean result = sentenceChecker.checkSentence("the quick brown fox said \\\"hello Mr lazy dog\\\".");
        assertEquals(false, result);
    }
    @Test
    void checkSentenceWithOddNumberOfDoubleQuotes() {
        Boolean result = sentenceChecker.checkSentence("The quick brown fox said \\\"hello Mr lazy dog.");
        assertEquals(false, result);
    }
    @Test
    void checkSentenceWithNumbers11And12() {
        Boolean result = sentenceChecker.checkSentence("Are there 11, 12, or 13 lazy dogs?");
        assertEquals(false, result);
    }
    @Test
    void checkSentenceWithNumbers1And2And9() {
        Boolean result = sentenceChecker.checkSentence("Are there 1, 2, or 9 lazy dogs?");
        assertEquals(false, result);
    }
    @Test
    void checkSentenceWithNumber12() {
        Boolean result = sentenceChecker.checkSentence("One lazy dog is too few, 12 is too many.");
        assertEquals(false, result);
    }

    @Test
    void checkSentenceWithNoPunctuation() {
        Boolean result = sentenceChecker.checkSentence("There is no punctuation in this sentence");
        assertEquals(false, result);
    }




}