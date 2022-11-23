package codingtest.study.minwook.string;

import static java.lang.String.valueOf;

public class SecretNumber {
    /**
     * 입력 : #, *로 구성된 문자와 문자의 개수
     * 조건 : #, * 구성 -> 각각 1,0으로 치환 -> 10진수화 -> 각 문자 합침
     * 출력 : 해당 조건에 맞추어 문자열 출력
     * **/
    public String secretNumberWithString(String str, int n){
        char[] ch = str.toCharArray();
        // 변환된 문자를 담을 StringBuiler. 나중에 String으로 변환해야 한다.
        StringBuilder a = new StringBuilder();

        // #, *를 각가 1,0으로 치환
        for(char c : ch){
            if(c == '#') a.append(1);
            else if(c == '*') a.append(0);
            // 나중에 split을 사용하기 위해 7개의 문자가 쌓일 때마다 공간여백 추가.
            if(a.length() % 7 == 6) a.append(" ");
        }
        // " "로 구간별로 문자 구별
        String[] bytecode = String.valueOf(a).split(" ");


        // byte로 변환한 값을 다시 char 형태로 담고, 후에 toString()으로 변환할 것.
        char[] almost = new char[bytecode.length];
        for(int i = 0; i < bytecode.length; i++){
            almost[i] = (char) Integer.parseInt((bytecode[i]));
        }
        // 변환
        String answer = almost.toString();
        return answer;
    }

    //해답
    public String solution(String str, int n){
        String answer = "";
        for(int i = 0; i < n; i++){
            String tmp = str.substring(0, 7).replace('#', '1').replace('*','0');

            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            str = str.substring(7);
        }
        return answer;
    }
}
