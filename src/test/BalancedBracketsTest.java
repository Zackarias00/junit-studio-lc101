package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void oneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void oneEndBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void reverseBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void multipleSquareBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch][Code]"));
    }

    @Test
    public void unevenBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch[Code]"));
    }

    @Test
    public void bracketsInsideBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[Code]]"));
    }

    @Test
    public void noBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void reversedBracketsInsideReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch]]Code["));
    }

}
