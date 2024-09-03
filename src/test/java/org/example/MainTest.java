package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MainTest {

    @Test
    void testSumOf2And3()  {
        int expected = 5;
        int actual = Main.sum(2,3);
        assertEquals(expected, actual);
    }

}