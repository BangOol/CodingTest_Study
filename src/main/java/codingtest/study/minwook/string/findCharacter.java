package codingtest.study.minwook.string;

public class findCharacter {
    // 입력 : 한 개의 문자열, 특정 문자
    // 출력 : 특정 문자가 문자열 내에 얼마나 포함되어 있는가? (대소문자 구분x)

    /**
     *     어떠한 값을 찾는데 있어서 변경, 수정, 삭제 등이 일어나지 않는다면
     *     StringBuilder와 StringBuffer의 사용은 적절하지 않다.
     *     String, StringBuffer, StringBuilder 모두 charSequence를 구현하고 있지만
     *     배열로 바꾸는 메서드인 toCharArray는 String에만 존재한다.
     *     게다가 객체 내 값을 바꾸고자 하는게 아니라면 String에 더욱 많은 기능이 있기 때문에
     *     상황에 맞추어 적절히 사용해야 한다.
     *     **/
    public int findCharacterWithStringBuilder(String input, String idx){ // 옳지 못한 풀이법 1
        int number = 0;
        StringBuilder builder = new StringBuilder(input.toLowerCase());
        builder.chars().forEach(System.out::println);
        return number;
    }

    public int findCharacterWithStringBuffer(String input, String idx){ // 옳지 못한 풀이법 2
        int number = 0;
        StringBuffer stringBuffer = new StringBuffer(input);
        return 0;
    }

    public int findCharacterWithString(String input, char idx){
        // 문자열을 char 타입의 배열로 바꾸기.
        char[] s = input.toLowerCase().toCharArray();
        int number = 0;

        // 배열 s의 길이만큼 향상된 for문을 사용하여, 각 index 내 값이 비교하고자 하는 값과 같은지 확인.
        for (char ch : s){
            if (ch == idx) { // 내가 char[]과 char ch와 비교하고 있어서 항상 false가 발생했다.
                number++;
            }
        }
        return number;
    }


}
