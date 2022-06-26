package pl.coderslab.seleniumcourse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTestClass {

    @Test
    public void firstTest() {
        // given
        int a = 18;
        int b = 11;
        // when
        int actual = a - b;
        // then
        assertEquals(7, actual);
    }
}
