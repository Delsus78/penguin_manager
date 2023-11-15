package manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PenguinTaskTest {
    @Test
    void assertDescription() {
        PenguinTask task = new PenguinTask("test");
        assertEquals("test", task.getDescription());
    }

    @Test
    void assertStatus() {
        PenguinTask task = new PenguinTask("test");
        assertEquals(false, task.getStatus());
    }

    @Test
    void assertSetStatus() {
        PenguinTask task = new PenguinTask("test");
        task.setStatus(true);
        assertEquals(true, task.getStatus());
    }
}
