import model.managers.TaskManager;
import model.managers.TaskPrinter;
import model.objetcs.Task;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        TaskPrinter taskPrinter = new TaskPrinter();
        taskManager.addTask(new Task("Tache 1", "Description de la tache 1"));
        taskManager.addTask(new Task("Tache 2", "Description de la tache 2"));
        taskManager.addTask(new Task("Tache 3", "Description de la tache 3"));

        taskManager.markTaskAsComplete(1);

        taskPrinter.printCompletedTasks(taskManager.getTasks());
        taskPrinter.printPendingTasks(taskManager.getTasks());
    }
}
