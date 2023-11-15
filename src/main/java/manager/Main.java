package manager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print(">>> ");
            String line = sc.nextLine();
            taskManager.commandHandler(line);
            System.out.println(taskManager);
        }
    }
}
