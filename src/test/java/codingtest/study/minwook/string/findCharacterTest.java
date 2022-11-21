package codingtest.study.minwook.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class findCharacterTest {

    findCharacter findCharacter = new findCharacter();
    @Test
    public void findCharacterWithStringBuiler(String test, char idx){
//        this.test = test;
//        this.idx = idx;
//        int number = findCharacter.findCharacterWithStringBuilder(test, idx);
//        Assertions.assertEquals(2, number);
    }

    // 성공
    @Test
    public void findCharacterWithString(){
        String test = "Aabded";
        char idx = 'a';
        int number = findCharacter.findCharacterWithString(test, idx);
        System.out.println(number);
    }

}
