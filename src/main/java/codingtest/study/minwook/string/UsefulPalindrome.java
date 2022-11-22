package codingtest.study.minwook.string;

public class UsefulPalindrome {
    public String UsefulPalindromeWithString(String str){
        String[] stAry = str.toLowerCase().split("^[a-z]*$");
        for(String i : stAry){
            System.out.println(i);
        }
        return str;
    }
}
