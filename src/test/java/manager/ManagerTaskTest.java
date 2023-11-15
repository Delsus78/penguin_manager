package manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerTaskTest {
    @Test
    void assertAddTask() {
        TaskManager taskmanager = new TaskManager();
        taskmanager.addTask("test");
        assertEquals(1, taskmanager.getTasks().size());
    }

    @Test
    void assertDeleteTask() {
        TaskManager taskmanager = new TaskManager();
        taskmanager.addTask("test");
        taskmanager.deleteTask(0);
        assertEquals(0, taskmanager.getTasks().size());
    }

    @Test
    void checkTaskStatus() {
        TaskManager taskmanager = new TaskManager();
        taskmanager.addTask("test");
        taskmanager.changeTaskStatus(0, true);
        assertEquals(true, taskmanager.getTasks().get(0).getStatus());
    }

    @Test
    void uncheckTaskStatus() {
        TaskManager taskmanager = new TaskManager();
        taskmanager.addTask("test");
        taskmanager.changeTaskStatus(0, false);
        assertEquals(false, taskmanager.getTasks().get(0).getStatus());
    }

    @Test
    void secondTaskIsInSecondPosition() {
        TaskManager taskmanager = new TaskManager();
        taskmanager.addTask("test");
        taskmanager.addTask("test2");
        assertEquals("test2", taskmanager.getTasks().get(1).getDescription());
    }

    @Test
    void addingCommandAddsTaskInList() {
        String command = "+ test";
        TaskManager taskmanager = new TaskManager();
        taskmanager.commandHandler(command);
        assertEquals(1, taskmanager.getTasks().size());
    }

    @Test
    void removeCommandDeletesTaskInList() {
        String command = "+ test";
        TaskManager taskmanager = new TaskManager();
        taskmanager.commandHandler(command);

        command = "- 0";
        taskmanager.commandHandler(command);
        assertEquals(0, taskmanager.getTasks().size());
    }

    @Test
    void changeStatusToDoneCommandChangeStatusInList() {
        String command = "+ test";
        TaskManager taskmanager = new TaskManager();
        taskmanager.commandHandler(command);

        command = "x 0";
        taskmanager.commandHandler(command);
        assertTrue(taskmanager.getTasks().get(0).getStatus());
    }

    @Test
    void changeStatusToUnfishedCommandChangeStatusInList() {
        String command = "+ test";
        TaskManager taskmanager = new TaskManager();
        taskmanager.commandHandler(command);

        command = "o 0";
        taskmanager.commandHandler(command);
        assertFalse(taskmanager.getTasks().get(0).getStatus());
    }
}
