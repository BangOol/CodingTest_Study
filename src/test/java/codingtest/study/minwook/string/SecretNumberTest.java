package codingtest.study.minwook.string;

import org.junit.jupiter.api.Test;

public class SecretNumberTest {
    SecretNumber secretNumber = new SecretNumber();
    String str = "####*#*#******#****#***#*#*#*#*#*##";
    int n = 5;
    @Test
    public void SecretNumberWithStringTest(){
        String answer = secretNumber.secretNumberWithString(str, n);
        System.out.println(answer);
    }
}
