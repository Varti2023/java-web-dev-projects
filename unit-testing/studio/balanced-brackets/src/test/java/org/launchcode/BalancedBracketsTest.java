package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    // Test 1

    @Test
    public void testEmptyBrackets() {
        String expected = "Empty brackets should be balanced";
        String actual = "[]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(actual), expected);
    }

    // Test 2
    @Test
    public void testUnbalancedLeftBracket() {
        String expected = "Unbalanced left bracket should be false";
        String actual = "[LaunchCode";
        assertFalse(BalancedBrackets.hasBalancedBrackets(actual), expected);
    }
    //Test 3
    @Test
    public void testTextOutsideBrackets() {
        String expected = "Text outside brackets should not affect balance";
        String actual = "Hello [World]!";
        assertTrue(BalancedBrackets.hasBalancedBrackets(actual), expected);
    }

    //Test 4
    @Test
    public void testEmptyString(){
        String expected = "Empty string has no brackets.";
        String actual = "";
        assertTrue(BalancedBrackets.hasBalancedBrackets(actual),expected);
    }

    //Test 5
    @Test
    public void testCurlyBrackets(){
        String expected = "Curly brackets should return false.";
        String actual = "{}[";
        assertFalse(BalancedBrackets.hasBalancedBrackets(actual),expected);
    }

    //Test 6
    @Test
    public void testReverseBrackets(){
        String expected = "Reverse brackets should return false.";
        String actual = "][";
        assertFalse(BalancedBrackets.hasBalancedBrackets(actual),expected);
    }

    //Test 7
    @Test
    public void testRightHalfBrackets(){
        String expected = "Reverse brackets should return false.";
        String actual = "]";
        assertFalse(BalancedBrackets.hasBalancedBrackets(actual),expected);
    }

    //Test 8
    @Test
    public void testReverseBracketsWithString(){
        String expected = "Reverse brackets should return false.";
        String actual = "]Launch[Code";
        assertFalse(BalancedBrackets.hasBalancedBrackets(actual),expected);
    }

    //Test 9
    @Test
    public void testBracketsWithString(){
        String expected = "Balanced brackets with string returns true.";
        String actual = "[]LaunchCode";
        assertTrue(BalancedBrackets.hasBalancedBrackets(actual),expected);
    }

    //Test 10
    @Test
    public void testPairsOfBrackets(){
        String expected = "Two different pair of brackets return false";
        String actual = "[]][";
        assertFalse(BalancedBrackets.hasBalancedBrackets(actual),expected);
    }

    //Test 11
    @Test
    public void testThreeBrackets(){
        String expected = "Two different pair of brackets return false";
        String actual = "[Launch]Code]";
        assertFalse(BalancedBrackets.hasBalancedBrackets(actual),expected);
    }

    //Test 12
    @Test
    public void testPairsOfBalancedBrackets(){
        String expected = "Two different pair of brackets return false";
        String actual = "[][]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(actual),expected);
    }
}