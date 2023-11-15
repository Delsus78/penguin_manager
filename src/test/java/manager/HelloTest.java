package manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import manager.Main;

public class HelloTest {
    private static Main main;

    @BeforeAll
    static void setup() {
        main = new Main();
    }

    @Test
    void test() {
        assertEquals(1, 1);
    }
}
