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

        // 아스키 코드를 활용하여 앞 문자, 뒷 문자가 서로 해당 위치에 속해 있는지 확인하고
        // 그렇지 않은 경우 바꾸지 않는다.
        for(int i = 0; i < ch.length/2; i++){
            char ex = ch[i];
            if((ch[i] >= 65 && ch[i] <= 90) || (ch[i] >= 97 && 122 >= ch[i])){
                ch[i] = ch[ch.length - i];
                ch[ch.length - i] = ex;
            }else if(i == ch.length/2 || i >= ch.length/2){
                break;
            }
        }
        String answer = ch.toString();
        return answer;
    }
}
