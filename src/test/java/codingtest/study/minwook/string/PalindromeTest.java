package codingtest.study.minwook.string;

import org.junit.jupiter.api.Test;

public class PalindromeTest {
    Palindrome palindrome = new Palindrome();
    String str = "gooog";

    @Test
    public void palindromeWithSpringTest(){
        String answer = palindrome.palindromeWithString(str);
        System.out.println(answer);
    }

}
