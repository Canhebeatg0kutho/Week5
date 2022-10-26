package ie.atu.Week5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    int int1;
    int int2;

    @BeforeEach
    void setUp() {
        int1 = 1;
        int2 = 2;
    }
 @Test
    void testTotal(){
        assertEquals(3,int1 + int2);
    }

    @Test
    void testMinus(){assertEquals(1,int2-int1);}

    @Test
    void testMultiply(){assertEquals(2,int1*int2);}

    @AfterEach
    void tearDown() {
    }
}