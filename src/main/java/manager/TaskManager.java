package manager;

import java.util.ArrayList;

public class TaskManager {
    private ArrayList<PenguinTask> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<PenguinTask>();
    }

    public void addTask(String description) {
        PenguinTask task = new PenguinTask(description);
        this.tasks.add(task);
    }

    public void deleteTask(int index) {
        this.tasks.remove(index);
    }

    public void changeTaskStatus(int index, boolean status) {
        PenguinTask task = this.tasks.get(index);
        task.setStatus(status);
    }

    public ArrayList<PenguinTask> getTasks() {
        return this.tasks;
    }
}
