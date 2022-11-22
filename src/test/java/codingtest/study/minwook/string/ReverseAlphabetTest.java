package codingtest.study.minwook.string;

import org.junit.jupiter.api.Test;

public class ReverseAlphabetTest {

    ReverseWithAlphabet reverseWithAlphabet = new ReverseWithAlphabet();
    String str = "s1edk#@NQL@!@K";
    @Test
    public void ReverseAlphabetWithString(){
        String answer = reverseWithAlphabet.ReverseAlphabetWithString(str);
        System.out.println(answer);
    }
}
