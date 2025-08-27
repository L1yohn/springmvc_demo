package Junit;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtil_test {
    @Test
    public void testPrintNumber(){
        StringUtil.printNumber("张三abc");
        StringUtil.printNumber("");
        StringUtil.printNumber(null);
    }
    @Test
    public void testGetMaxIndex(){
        int index=StringUtil.gerMaxIndex("abcdefg");
        int index1=StringUtil.gerMaxIndex("");
        int index2=StringUtil.gerMaxIndex(null);
        System.out.println(index);
        System.out.println(index1);
        System.out.println(index2);
        //断言
        Assertions.assertEquals(6,index);
        Assertions.assertEquals(-1,index1);
        Assertions.assertEquals(-1,index2);
    }
}
