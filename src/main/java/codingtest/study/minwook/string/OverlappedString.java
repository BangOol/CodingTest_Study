package codingtest.study.minwook.string;

public class OverlappedString {

    /**
     * 입력 : 문자열 1개
     * 조건 : 중복된 문자가 있는지 확인 후 제거한다. 첫 번째 중복 문자는 그대로 두되, 그 이후의 문자는 제거해야 한다.
     * 출력 : 중복된 문자가 제거된 문자열**/
    public String OverlappedStringWith(String str){
        // 출력값을 저장하기 위한 sb 생성
        StringBuilder sb = new StringBuilder();
        char[] ch = str.toCharArray();

        for(int i = 0; i < ch.length; i++){
            // indexOf를 사용하여 해당 문자열이 존재하는지, 존재하지 않는지 확인
            if(sb.indexOf(String.valueOf(ch[i])) == -1){
                // 있을 경우 StringBuiler 타입에 문자 추가.
                sb.append(ch[i]);
            }
        }
        // String 타입 변환
        String answer = sb.toString();
        return answer;
    }
}
