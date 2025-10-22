package model.managers;

import model.objetcs.Task;

public class TaskFormater {

    public String format(Task task) {
        return "Tache : " + task.getTitle() + " - " + task.getDescription() + " | Statut : " + (this.formatCompletion(task));
    }

    private String formatCompletion(Task task) {
        return task.isCompleted() ? "Terminee" : "Non terminee";
    }
}
