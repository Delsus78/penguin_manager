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

    public void commandHandler(String line) {
        String[] input = line.split(" ", 2);
        char command = input[0].charAt(0);
        String arg = input[1];
        switch(command) {
            case '+':
                this.addTask(arg);
                break;
            case '-' :
                this.deleteTask(Integer.parseInt(arg));
                break;
            case 'x' :
                this.changeTaskStatus(Integer.parseInt(arg), true);
                break;
            case 'o' :
                this.changeTaskStatus(Integer.parseInt(arg), false);
                break;
            case 'q' :
                System.exit(0);
                break;
            default :
                break;
        }
    }
}
