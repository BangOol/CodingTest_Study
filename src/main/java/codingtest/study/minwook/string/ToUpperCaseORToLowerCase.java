package codingtest.study.minwook.string;

public class ToUpperCaseORToLowerCase {
    // 입력 : 바꾸고자 하는 문자열
    // 출력 : 문자열의 대소문자를 변경하여 출력
    public StringBuilder changeCase(String str){


        /**
         * 굳이 StringBuilder로 받은 이유는 String으로도 충분히 변환값을 받을 수 있지만
         * 새로운 객체가 수없이 나오면서 메모리 낭비가 심하기 때문에 String은 적절하지 않다고 보았다.
         * **/

        // 출력값을 받을 StringBuilder 생성
        StringBuilder stringBuilder = new StringBuilder();

        // 전체 문자열의 대소문자를 변경하기 위해 배열로 변경.
        char[] ary = str.toCharArray();

        // 문자열 수만큼 for문 돌리기.
        // 소문자 -> 대문자, 대문자 -> 소문자
        for(char ch : ary){
            if(ch >= 65 && ch < 90){
                ch = (char)(ch + 32);
                stringBuilder.append(ch);
            }else if(ch >= 97 && ch < 122) {
                ch = (char) (ch - 32);
                stringBuilder.append(ch);
            }
        }
        return stringBuilder;
    }


    /**
     * String이 굳이 아니더라도 toLowerCase와 toUpperCase를 사용하려면
     * Character 클래스의 isLowerCase, isUpperCase, toLowerCase, toUpperCase 등을 사용해야 한다.
     * 그 외에도 다양한 기능들에 대해 한번 살펴보자.**/
    public StringBuilder UseCharacterToLowerCase(String str){
        StringBuilder s = new StringBuilder();
        char[] ch = str.toCharArray();
        for(char c : ch){
            if(Character.isLowerCase(c)) s.append(Character.toUpperCase(c));
            else if(Character.isUpperCase(c)) s.append(Character.toLowerCase(c));
        }
        return s;
    }
}
