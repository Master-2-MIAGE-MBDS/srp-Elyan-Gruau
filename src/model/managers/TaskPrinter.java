package model.managers;

import model.objetcs.Task;

import java.util.List;

public class TaskPrinter {

    protected TaskFormater formater;

    public TaskPrinter(TaskFormater formater) {
        this.formater = formater;
    }

    // Générer un rapport des tâches terminées
    public void printCompletedTasks(List<Task> tasks) {
        System.out.println("Taches terminees :");
        for (Task task : tasks) {
            if (task.isCompleted()) {
                System.out.println(this.formater.format(task));
            }
        }
    }

    // Générer un rapport des tâches non terminées
    public void printPendingTasks(List<Task> tasks) {
        System.out.println("Taches non terminees :");
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                System.out.println(this.formater.format(task));
            }
        }
    }
}
