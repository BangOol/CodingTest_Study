package codingtest.study.minwook.string;

import org.junit.jupiter.api.Test;

public class ExtractionNumberTest {
    ExtractionNumber extractionNumber = new ExtractionNumber();
    String str = "sdf1211r2klf1k2lf12k";
    @Test
    public void ExtractionNumberWithStringBuilderTest(){
        int number = extractionNumber.extractionNumberWithStringBuiler(str);
        System.out.println(number);
    }
}
