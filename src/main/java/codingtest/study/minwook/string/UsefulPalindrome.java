package codingtest.study.minwook.string;

public class UsefulPalindrome {
    public String UsefulPalindromeWithString(String str) {
        String[] stAry = str.toLowerCase().split("^[a-z]*$");
        for (String i : stAry) {
            System.out.println(i);
        }
        return str;
    }

    // 해답
    public String palindromeSolution(String str) {
        String answer = "NO";

        // [^A-Z] : A-Z를 제외한 나머지 -> ""로 대체
        str = str.toUpperCase().replaceAll("[^A-Z]", "");

        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) answer = "YES";
        return answer;
    }



}
