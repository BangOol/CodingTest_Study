package codingtest.study.minwook.string;

import org.junit.jupiter.api.Test;
import org.springframework.util.StopWatch;

public class findLongestWordTest {

    findLongestWord findLongestWord = new findLongestWord();

    @Test
    public void useSplitTest(){
        String str = "i was in the Spring";
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        String answer = findLongestWord.useSplit(str);
        stopWatch.stop();
        System.out.println(answer);
        System.out.println(stopWatch.getLastTaskTimeNanos());
    }

    @Test
    public void userSplitWithStringBuilerTest(){
        String str = "i was in the Spring";
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        StringBuilder answer = findLongestWord.useSplitWithStringBuilder(str);
        stopWatch.stop();
        System.out.println(answer);
        System.out.println(stopWatch.getLastTaskTimeNanos());
    }
}
