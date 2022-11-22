package codingtest.study.minwook.string;

public class ReverseWord {
    /**
     * 입력 : 자연수 N, 그에 맞는 단어 개수
     * 출력 : 입력된 단어들이 뒤집어진 상태여야 한다. - 대소문자 구별
     **/

    public StringBuilder[] StringBuilderAnswer(String[] str, int number){
        // 입력된 값 number 수에 맞게 배열 생성
        StringBuilder[] tray = new StringBuilder[number];
        for(int i = 0; i < number; i++){
            tray[i] = new StringBuilder(str[i]);
        }

        // 각 인덱스에 있는 값을 역전시키기.
        for(int m = 0; m < tray.length; m++){
            tray[m] = tray[m].reverse();
        }
        // 출력값 반환
        return tray;
    }

    public String[] reverseWordWithString(String[] str, int number){
        // 답을 담을 배열 생성
        String[] answer = new String[number];
        
        // 입력된 값 number 수에 맞게 배열 생성
        StringBuilder[] tray = new StringBuilder[number];
        for(int i = 0; i < number; i++){
            tray[i] = new StringBuilder(str[i]);
        }

        // 각 인덱스에 있는 값을 역전시키기.
        for(int m = 0; m < tray.length; m++){
            tray[m] = tray[m].reverse();
            // String 타입으로 변경해놓기.
            answer[m] = String.valueOf(tray[m]);
        }

        // 출력값 반환
        return answer;
    }
}
