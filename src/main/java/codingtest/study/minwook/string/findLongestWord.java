package codingtest.study.minwook.string;

public class findLongestWord {

    /**
     * 어떠한 것도 고려하지 않고 문제만을 풀었을 때의 경우다.
     * 시간 복잡도에 대해서는 복잡할 이유가 없고, 다른 풀이들도 같은 복잡도를 가지겠지만
     * 공간 복잡도에 대해서는 String의 남용으로 인해 과도한 String 객체들이 생성되어
     * 메모리 낭비가 예상된다.**/
    public String useSplit(String str){
        String answer = "";
        int number = 0;
        String[] s = str.split(" ");
        for (String idx: s) {
            if(idx.length() > number) {
                number = idx.length();
                answer = idx;
            }
        }
        return answer;
    }

    // 계속해서 생겨나는 String을 생각해서 StringBuiler로 answer를 받긴했으나
    // StringBuilder 생성자를 계속 생성하다보니 오히려 의미가 없는 것으로 보인다...
    public StringBuilder useSplitWithStringBuilder(String str){
        StringBuilder answer = new StringBuilder();
        int number = 0;
        String[] s = str.split(" ");
        for (String idx: s) {
            if(idx.length() > number) {
                number = idx.length();
                answer = new StringBuilder(idx);
            }
        }
        return answer;
    }


}
