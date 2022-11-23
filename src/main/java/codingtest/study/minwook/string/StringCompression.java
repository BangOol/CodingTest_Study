package codingtest.study.minwook.string;

import java.util.ArrayList;
import java.util.List;

public class StringCompression {
    /**
     * 입력 : 문자열
     * 조건 : 해당 문자가 몇 번 겹치는지 체크하고, 각 문자 옆에 몇 번 중복되었는지를 표시하라.
     * 출력 : 문자열
     * **/
    
    public String StringCompressionWithString(String str){
        // str를 toCharArray()를 통해 char 배열로 재생성.
        char[] ch = str.toCharArray();
        // 문자 개수를 담아놓는 배열과 문자 종류를 담는 배열 생성
        char[] list = new char[ch.length];
        List<Integer> num = new ArrayList<>();
        
        // 문자 개수와 문자 종류를 담는 과정
        for(int i = 0; i < ch.length; i++){
            
            // 해당 문자가 존재하는지 확인
            for(int m = 0; m < ch.length; i++){

            }
        }
        return null;
    }

    // 해답
    public String solution(String str){
        String answer = "";
        str = str + "";
        int cnt = 1;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i + 1)) cnt++;
            else{
                answer += str.charAt(i);
                if(cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }
        return answer;
    }

}
