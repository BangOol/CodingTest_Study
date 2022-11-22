package codingtest.study.minwook.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.abs;

public class ShortestDistance {
    /**
     * 입력 : 문자열, 문자
     * 조건 : 입력된 문자를 기준으로 다른 문자들이 얼마만큼의 거리를 가지고 있는지 확인. 단 최소거리를 체크해야 한다.
     * 출력 : 입력된 문자에 대해 각 문자가 얼마만큼의 거리를 가지고 있는지를 숫자 배열로 표현
     * **/

    public int[] shortestDistanceWithString(String str, char e){
        //str를 toCharArray를 이용하여 char 배열로 변환
        char[] ch = str.toCharArray();
        // 해당 문자가 포함되어 있는 인덱스 값 확인
        List<Integer> list = new ArrayList<>();
        // 계산을 위한 int 값 선언
        int num = 0;

        // 결과값을 위한 int[]
        int[] answer = new int[ch.length];

        // 입력된 문자가 어느 인덱스에 있는지 확인
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == e) list.add(i);
        }

        // for문을 이용하여 해당 문자가 들어있는 인덱스와 비교하고자 하는 문자 인덱스 거리 계산.
        // 이 때 가장 작은 값을 배열에 등록한다.
        for(int m = 0; m < ch.length; m++){


            // 가지고 있는 문자에 대해서 각 거리를 재야 함.
            for(int n = 0; n < list.size(); n++){
                // 해당 인덱스와 가장 거리가 가깝다면, 그 인덱스와의 차가 다른 인덱스에 비해 가장 낮을 것이다.
                // 극단적인 예시로 [2, 5, 7]라는 배열이 있고, 그 값과 다른 문자의 인덱스 값을 통해 비교한다고 치자.
                // 그렇다면 제일 처음 비교했을 때는 배열의 첫 번째 값과 인덱스 값을 비교하게 된다. |2 - idx|
                // 인덱스가 증가할수록 그 첫 번째 값과 인덱스 간의 간격은 커지게 되고, 그 값과 비교하여 다른 배열의 값이 더 작으면 그 값을 대입하면 된다.
                // 그 값을 기준으로 계산하면 되지 않을까?
                num = abs(m - list.get(0));
                if(num > abs(list.get(n) - m))
                    num = abs(list.get(n) - m);
                    answer[m] = num;
            }
        }

        // 결과값 반환
        return answer;
    }
}
