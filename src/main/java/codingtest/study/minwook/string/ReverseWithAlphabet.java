package codingtest.study.minwook.string;

public class ReverseWithAlphabet {
    /**
     * 입력 : 문자열
     * 조건 : 역전하고자 하는 문자가 둘 다 알파벳이어야 하며, 특수문자일 경우 뒤집지 않는다.
     * 출력 : 조건에 맞는 역전값
     * **/
    public String ReverseAlphabetWithString(String str){
        // String 타입의 입력값을 char 타입의 배열로 변경
        char[] ch = str.toCharArray();
        char tray = '3';

        // 아스키 코드를 활용하여 앞 문자, 뒷 문자가 서로 해당 위치에 속해 있는지 확인하고
        // 그렇지 않은 경우 바꾸지 않는다.
        for(int i = 0; i < (int)ch.length/2; i++){
            // 반대쪽에서 문자를 확인하기 위해 인덱스 값 생성
            int m = ch.length - i - 1;
            char ex = ch[i];

            
            // 앞 열의 문자와 뒷 열의 문자가 알파벳인지를 확인
            if(((ch[i] >= 65 && ch[i] <= 90) || (ch[i] >= 97 && 122 >= ch[i])) && ((ch[m]>= 65 && ch[m] <= 90) || (ch[m] >= 97 && 122 >= ch[m]))){
                tray = ch[i];
                ch[i] = ch[m];
                ch[m] = tray;

            }
        }
        // ch.length가 홀수인 경우 가운데 값을 넣어줄 필요가 없다. 이미 제자리에 있기 때문에 별도로 손 댈 필요 없음.

        // char 타입의 배열을 통해 String 값을 반환하고 싶다면 String.valueOf를 사용하자.
        String answer = String.valueOf(ch);
        return answer;
    }
}
