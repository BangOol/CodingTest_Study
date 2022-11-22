package codingtest.study.minwook.string;

public class ExtractionNumber {

    public int extractionNumberWithStringBuiler(String str){
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : ch){
            if((c >= 48) && (c <= 57)) sb.append(c);
        }
        int num = Integer.parseInt(String.valueOf(sb));
        return num;
    }
}
