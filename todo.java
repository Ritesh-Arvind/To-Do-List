import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private static ArrayList<String> tasks = new ArrayList<>();

    public static void addTask(String task) {
        tasks.add(task);
        System.out.println("Task '" + task + "' added.");
    }

    public static void removeTask(String task) {
        if (tasks.remove(task)) {
            System.out.println("Task '" + task + "' removed.");
        } else {
            System.out.println("Task not found.");
        }
    }

    public static void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            System.out.println("To-Do List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Task\n2. Remove Task\n3. Show Tasks\n4. Exit");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter the task: ");
                    String task = scanner.nextLine();
                    addTask(task);
                    break;
                case "2":
                    System.out.print("Enter the task to remove: ");
                    task = scanner.nextLine();
                    removeTask(task);
                    break;
                case "3":
                    showTasks();
                    break;
                case "4":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
public class ToDoList {
    private static ArrayList<String> tasks = new ArrayList<>();

    public static void addTask(String task) {
        tasks.add(task);
        System.out.println("Task '" + task + "' added.");
    }

    public static void removeTask(String task) {
        if (tasks.remove(task)) {
            System.out.println("Task '" + task + "' removed.");
        } else {
            System.out.println("Task not found.");
        }
    }

    public static void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            System.out.println("To-Do List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Task\n2. Remove Task\n3. Show Tasks\n4. Exit");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter the task: ");
                    String task = scanner.nextLine();
                    addTask(task);
                    break;
                case "2":
                    System.out.print("Enter the task to remove: ");
                    task = scanner.nextLine();
                    removeTask(task);
                    break;
                case "3":
                    showTasks();
                    break;
                case "4":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
