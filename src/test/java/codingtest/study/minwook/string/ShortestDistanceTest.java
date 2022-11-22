package codingtest.study.minwook.string;

import org.junit.jupiter.api.Test;

public class ShortestDistanceTest {
    ShortestDistance shortestDistance = new ShortestDistance();

    String str = "aawlqkwn";
    char e = 'q';

    @Test
    public void ShortestDistanceWithArrayList(){
        int[] answer = shortestDistance.shortestDistanceWithString(str, e);
        for(int i : answer){
            System.out.print(i + " ");
        }
    }
}
