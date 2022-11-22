package codingtest.study.minwook.string;

import org.junit.jupiter.api.Test;

public class ReverseAlphabetTest {

    ReverseWithAlphabet reverseWithAlphabet = new ReverseWithAlphabet();
    String str = "s1edk#@NQLK";

    @Test
    public void ReverseAlphabetWithString(){
        String x = reverseWithAlphabet.ReverseAlphabetWithString(str);
        System.out.println(x);
    }
}
