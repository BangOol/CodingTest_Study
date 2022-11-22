package codingtest.study.minwook.string;

public class Palindrome {

    public String palindromeWithString(String str){
        // return할 값 선언
        String Y = "YES";
        String N = "NO";
        
        // 입력값 배열로 변환
        char[] ch = str.toCharArray();
        
        // 값을 비교하기 위해 문자를 넣어놓을 char 타입 변수 생성
        char m = '!';
        
        // 배열의 길이/2 만큼 앞과 뒤를 비교하여, 같은 문자인지 확인
        for(int i = 0; i < ch.length/2; i++){
            if(ch[i] == ch[ch.length - i - 1]) continue;
            else return N;
        }
        return Y;
    }
}
