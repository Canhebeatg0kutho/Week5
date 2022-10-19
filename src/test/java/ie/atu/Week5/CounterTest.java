package ie.atu.Week5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {
    Counter myCount;


    @BeforeEach
    void setUp() {
        myCount = new Counter();
    }

    @Test
    void testIncrement()
    {
        assertEquals(2,myCount.increment());
    }

    @Test
    void testConstructor()
    {
        assertThrows(IllegalArgumentException.class, () -> {new Counter(6);});

    }

    @AfterEach
    void tearDown() {
    }
}