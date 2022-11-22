package codingtest.study.minwook.string;

import org.junit.jupiter.api.Test;

public class OverlappedStringTest {

    OverlappedString overlappedString = new OverlappedString();
    String str = "11fdqssr";

    @Test
    public void OverlappedStringWithStringBuiler(){
        String s = overlappedString.OverlappedStringWith(str);
        System.out.println(s);
    }

}
