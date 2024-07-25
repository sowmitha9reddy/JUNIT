//import jdk.internal.icu.text.UnicodeSet;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.util.ArrayList;
import java.util.Arrays;

public class cal {
    Calculator c = new Calculator();

    @Nested
    @DisplayName("Addition test Cases")
    class AdditionTest {

        @Test
        @DisplayName("TEST1")
        void additionTest1() {
            Assertions.assertEquals(3, c.add(1, 2));
        }

        @Test
        @DisplayName("TEST2")
        void additionTest2() {
            Assertions.assertEquals(4, c.add(2, 2));
        }

        @Test
        @DisplayName("TEST3")
        void additionTest3() {
            Assertions.assertEquals(-3, c.add(-1, -2));
        }

        @Test
        @DisplayName("Test4")
        void additionTest4() {
            Assertions.assertEquals(5, c.add(3, 2));
        }
    }

    @Test
    @DisplayName("Mulitply")
    public void multiply() {

        Assertions.assertEquals(5, c.mul(1, 5));
    }

    @EnabledOnOs(OS.WINDOWS)
    @Test
    @DisplayName("div")
    @RepeatedTest(5)
    void divide(RepetitionInfo info) {
        if (info.getCurrentRepetition() == 2) {
            Assertions.assertEquals(1, c.div(2, 2));
        }
//        boolean needToDivide=true;
//       Assumptions.assumeTrue(needToDivide);
        else {
            Assertions.assertEquals(1, c.div(2, 2));
        }
    }

    @Test
    @DisplayName("Assert Equal Test Case")
    public void assertEqulasTest() {
        //Assertions.assertEquals(4,c.add(2,2),() ->"Assert Equla test failed");
        // Assertions.assertEquals(3,c.add(2,2),"Assert Equla test failed");
        Assertions.assertNotEquals(3, c.add(2, 2));
    }

    @Test
    @DisplayName("Assert Array Equal Test Case")
    public void assertArrayEquals() {
        Assertions.assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3}, () -> "order is unequals"); // comparing arrays
    }
    @Test
    @DisplayName("Assert Iterable Equals Test case")
    public void assertIterableEqual() {
        Iterable<Integer> list1=new ArrayList<>(Arrays.asList(1,2,3));
        Iterable<Integer> list2=new ArrayList<>(Arrays.asList(1,2,3));
        Assertions.assertIterableEquals(list1, list2);
    }

    @Test
    @DisplayName("Assert Not Null test")
    public void assertNotNull() {
        String nullStr=null;
        String notnullStr="ABC";
        Assertions.assertNotNull(notnullStr,()->"it is not null");
    }
    @Test
    @DisplayName("Assert true test")
    public void assertTrueTest() {
        boolean trueBool=true;
        boolean  falseBoolean=false;
        Assertions.assertTrue(trueBool,()->"Assert True Test failed");
    }
    @Test
    @DisplayName("Assert false test")
    public void assertFalseTest() {
        boolean trueBool=true;
        boolean  falseBoolean=false;
        Assertions.assertFalse(falseBoolean,()->"Assert False Test failed");
    }

    @Test
    @DisplayName("Assert Exception Test")
    public void assertException() {
        Assertions.assertThrows(ArithmeticException.class, () -> c.div(1, 0));

    }
//    @Test
//    @DisplayName("Assert Exception failing")
//    public void assertExceptionfail() {
//        Assertions.assertThrows(NullPointerException.class, ()->c.div(1,0),()->"Assert exception failed");

    @Test
    @DisplayName("Assert All")
    public void assertAll() {
        Assertions.assertAll(
                () -> Assertions.assertEquals(4, c.add(1, 3)),
                () -> Assertions.assertEquals(2, c.add(-1, 3)),
                () -> Assertions.assertEquals(-4, c.add(-1, -3)),
                //()->Assertions.assertEquals(4,c.add(0,2))
                () -> Assertions.assertEquals(-2, c.add(-1, -1))


        );
    }

//    @Test
//    @DisplayName("Assert Fail ")
//    public void assertFailTest(){
//        Assertions.fail("This test case will fail");
//    }

    @Test
    @DisplayName("Assert Equal Test Case are excueting")
    public void assertEqulasTest1() {
        Assertions.assertEquals(0, c.sub(2, 2), () -> "Assert Equal test Failed");


    }


}