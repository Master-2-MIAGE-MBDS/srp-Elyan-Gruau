package model.managers;

import model.objetcs.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private final List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    // Ajouter une nouvelle tâche
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Marquer une tâche comme terminée
    public void markTaskAsComplete(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(true);
        }
    }

    public List<Task> getTasks() {
        return new ArrayList<>(this.tasks);
    }

}