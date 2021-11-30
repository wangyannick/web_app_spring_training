package fr.lernejo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void fact_of_0_throw_IllegalArgumentException() {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Sample().fact(-1);
        });

        String expectedMessage = "N should be positive";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    void fact() {
        assertEquals(new Sample().fact(10), 3628800);
    }

    @Test
    void opMULT() {
        assertEquals(new Sample().op(Sample.Operation.MULT, 5, 5), 25);
    }

    @Test
    void opADD() {
        assertEquals(new Sample().op(Sample.Operation.ADD, 5, 5), 10);

    }
}
