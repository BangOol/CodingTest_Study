package codingtest.study.minwook.string;

import org.junit.jupiter.api.Test;

public class ToUpperCaseORToLowerCaseTest {

    ToUpperCaseORToLowerCase toUpperCaseORToLowerCase = new ToUpperCaseORToLowerCase();
    @Test
    public void changeCase(){
        String str = "StUdY";
        StringBuilder s = toUpperCaseORToLowerCase.changeCase(str);
        System.out.println(s);
    }

    @Test
    public void useCharacterChangeCase(){
        String str = "StUdY";
        StringBuilder s = toUpperCaseORToLowerCase.UseCharacterToLowerCase(str);
        System.out.println(s);
    }
}
