package manager;

import java.util.Scanner;

public class Main {
    public String hello() {
        return "Hello, world!";
    }

    public static void main(String[] args) {
        Main main = new Main();
        TaskManager taskManager = new TaskManager();
        System.out.println(main.hello());
        Scanner sc = new Scanner(System.in);
        while(true) {
            String line = sc.nextLine();
            taskManager.commandHandler(line);
        }
    }
}
