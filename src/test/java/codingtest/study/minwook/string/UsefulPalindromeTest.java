package codingtest.study.minwook.string;

import org.junit.jupiter.api.Test;

public class UsefulPalindromeTest {
    UsefulPalindrome palindrome = new UsefulPalindrome();
    String str = "this; is ,, sparta .; shit";
    @Test
    public void UsefulPalindromeTestWithString(){
        String st = palindrome.UsefulPalindromeWithString(str);
        System.out.println(st);
    }
}
