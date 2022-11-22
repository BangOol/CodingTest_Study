package codingtest.study.minwook.string;

import org.junit.jupiter.api.Test;
import org.springframework.util.StopWatch;

import java.util.Arrays;

public class ReverseWordTest {
    ReverseWord reverseWord = new ReverseWord();
    String[] ary = {"Test", "Coding", "I like it"};
    int N = 2;

    @Test
    public void StringBuilderAnswer(){
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        StringBuilder[] a = reverseWord.StringBuilderAnswer(ary, N);
        for(StringBuilder s : a){
            System.out.println(s);
        }
        stopWatch.stop();
        System.out.println(stopWatch.getLastTaskTimeNanos());
    }

    @Test
    public void ReverseWordWithString(){
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        String[] a = reverseWord.reverseWordWithString(ary, N);
        for(String s : a){
            System.out.println(s);
        }
        stopWatch.stop();
        System.out.println(stopWatch.getLastTaskTimeNanos());
    }
}
